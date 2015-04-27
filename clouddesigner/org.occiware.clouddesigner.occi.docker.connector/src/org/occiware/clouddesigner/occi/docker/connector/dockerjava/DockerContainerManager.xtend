package org.occiware.clouddesigner.occi.docker.connector.dockerjava

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerCmd
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.command.InspectContainerResponse
import com.github.dockerjava.api.model.ExposedPort
import com.github.dockerjava.api.model.Link
import com.github.dockerjava.api.model.LxcConf
import com.github.dockerjava.api.model.Ports
import com.github.dockerjava.api.model.Volume
import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.core.DockerClientConfig
import java.net.URI
import java.net.URL
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.DockerFactory
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerConfig

class DockerContainerManager {

	def createContainer(Machine machine, Container container) {

		// Initialize the model
		DockerFactory.eINSTANCE.eClass

		// Set dockerClient
		val dockerClient = setConfig(machine)
		var Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>
		val create = containerFactory(container, dockerClient)
		// Run Execution
		val CreateContainerResponse rcontainer = create.exec
		result.put(dockerClient, rcontainer)
		return result
	}
	
	def containerFactory(Container container, DockerClient dockerClient) {
		var CreateContainerCmd create = null
		if (container.image != null) {
			create = dockerClient.createContainerCmd(container.image)
		} else if (container.image == null) {
			create = dockerClient.createContainerCmd("busybox")
		}
		if (container.command != null) {
			//TODO command as "sleep", "9999"
			val String[] cmd = container.command.split(",")
			create.withCmd(cmd)
		}
		if (container.cpu_shares > 0) {
			create.withCpuShares(container.cpu_shares)
		}
		if (container.add_host != null) {
			create.withHostName(container.hostname)
		}
		if (container.cpuset != null) {
			create.withCpuset(container.cpuset)
		}
		if (container.privileged) {
			create.withPrivileged(container.privileged)
		}
		if (container.dns != null) {
			create.withDns(container.dns)
		}
		if (container.environment != null) {
			create.withEnv(container.environment)
		}
		if (container.ports != null) {
			var ExposedPort port = ExposedPort.tcp(Integer.parseInt(container.ports))
			val Ports portBindings = new Ports
			portBindings.bind(port, Ports.Binding(11022)) //TODO Create dynamique port number
			create.withPortBindings(portBindings)
		}
		if (container.name != null) {
			create.withName(container.name)
		}
		if (container.net != null) {
			create.withNetworkMode(container.net)
		}
		if (container.publish_all) {
			create.withPublishAllPorts(container.publish_all)
		}
		if (container.tty) {
			create.withTty(container.tty)
		}
		if (container.stdin_open) {
			create.withStdInOnce(container.stdin_open)
		}
		if (container.user != null) {
			create.withUser(container.user)
		}
		if (container.volumes != null) {
			create.withVolumes(new Volume(container.volumes))
		}
		if (container.mem_limit > 0) {
			create.withMemoryLimit(container.mem_limit)
		}
		if (container.memory_swap > 0) {
			create.withMemorySwap(container.memory_swap)
		}
		if (container.lxc_conf != null) {
			//TODO lxc_conf should be an String array..
			val LxcConf lxcCon = new LxcConf("key", "value")
			create.withLxcConf(lxcCon)
		}
		if (container.cores > 0) {
			create.withCpuset(String.valueOf(container.cores))
		}
		if (container.links.size > 0) {
		
			//TODO Link container.links.get(0)
			val Link link = new Link("name", "alias")
			create.withLinks(link)
		}
		
		return create
	}

	def inspectContainer(Map<DockerClient, CreateContainerResponse> map) {
		val dockerClient = map.keySet().iterator().next() as DockerClient
		val createContainerResponse = map.get(dockerClient) as CreateContainerResponse
		val InspectContainerResponse inspectContainerResponse = dockerClient.inspectContainerCmd(
			createContainerResponse.getId()).exec();
		return inspectContainerResponse

	}

	def startContainer(Map<DockerClient, CreateContainerResponse> map) {
		val dockerClient = map.keySet().iterator().next() as DockerClient
		val createContainerResponse = map.get(dockerClient) as CreateContainerResponse
		dockerClient.startContainerCmd(createContainerResponse.id).exec
	}

	def stopContainer(Map<DockerClient, CreateContainerResponse> map) {
		val dockerClient = map.keySet().iterator().next() as DockerClient
		val createContainerResponse = map.get(dockerClient) as CreateContainerResponse
		dockerClient.stopContainerCmd(createContainerResponse.id).exec
	}

	def waitContainer(Map<DockerClient, CreateContainerResponse> map) {
		val dockerClient = map.keySet().iterator().next() as DockerClient
		val createContainerResponse = map.get(dockerClient) as CreateContainerResponse
		dockerClient.waitContainerCmd(createContainerResponse.id).exec
	}
	
	def listContainer(Machine machine) {
		// Set dockerClient
		val dockerClient = setConfig(machine)
		val List<com.github.dockerjava.api.model.Container> containers = dockerClient.listContainersCmd().withShowAll(true).exec()
		for (com.github.dockerjava.api.model.Container c:containers){
			//val InspectContainerResponse inspectContainerResponse = dockerClient.inspectContainerCmd(c.getId()).exec()
			
			
			println(c.id)
			println("Status: "+ c.status)
			println("Command: "+ c.command)
			println("Name: " + c.names.get(0))
			println("Created: "+ c.created)
			println("Image: "+ c.image)
			for (com.github.dockerjava.api.model.Container.Port p:c.ports){
				println("Ip: "+ p.ip)
				println("PrivatePort: "+ p.privatePort)
				println("PublicPort: "+ p.publicPort)
				println("Type: "+ p.type)
				
			}
		}
		
		return containers
	}
	
	def pullImage(Machine machine, String image){
		// Set dockerClient
		val dockerClient = setConfig(machine)
		println("Downloading image: ->" + image)
		// Download a pre-built image
		val output = DockerUtil.asString(dockerClient.pullImageCmd(image).withTag("latest").exec)
		println(output)
		println("Download is finished")
		
		return dockerClient
		
	}

	def setConfig(Machine machine) {
		val dockerClientconfig = DockerConfig.loadConfig 
		var String ENDPOINT = DockerMachineManager.urlCmd(Runtime.getRuntime, machine.name)
		val String certPath = DockerUtil.getEnv(machine.name)
		val String port = ":2376"
		val url = new URL(ENDPOINT)
		val URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null)
		val dockerUri = uri.toString + port
		println(uri.toString)
		var DockerClientConfig config = DockerClientConfig.createDefaultConfigBuilder().withVersion(dockerClientconfig.get("docker.version").toString) //Docker Client API v1.16
		.withUri(dockerUri).withUsername(dockerClientconfig.get("docker.username").toString)
		.withPassword(dockerClientconfig.get("docker.password").toString)
		.withEmail(dockerClientconfig.get("docker.email").toString)
		.withServerAddress("https://index.docker.io/v1/")
		.withDockerCertPath(certPath).build();
		var DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();
		return dockerClient
	}
}
