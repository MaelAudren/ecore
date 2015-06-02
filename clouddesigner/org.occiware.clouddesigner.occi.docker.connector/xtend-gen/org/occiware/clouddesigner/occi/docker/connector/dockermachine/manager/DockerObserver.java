/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager;

import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CPUManager;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.MemoryManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerObserver {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerObserver.class);
  
  protected static Container cpContainer = null;
  
  public Machine listener(final Machine machine) {
    Machine _copy = EcoreUtil.<Machine>copy(machine);
    final Machine cpMachine = ((Machine) _copy);
    EList<Adapter> _eAdapters = machine.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          Object _oldValue = notification.getOldValue();
          String _plus = ("Ancienne Valeur : " + _oldValue);
          DockerObserver.LOGGER.info(_plus);
          Object _newValue = notification.getNewValue();
          String _plus_1 = ("Nouvelle Valeur : " + _newValue);
          DockerObserver.LOGGER.info(_plus_1);
          Machine machine = cpMachine;
          InputOutput.<String>println(
            "<-------------------------Attention on veut me modifier -------------------------->\n\n\n\n\n\n\n\n");
        }
      });
    return machine;
  }
  
  public Container listener(final Container container, final Machine machine) {
    Container _copy = EcoreUtil.<Container>copy(container);
    DockerObserver.cpContainer = ((ExecutableContainer) _copy);
    String _name = machine.getName();
    String _env = DockerUtil.getEnv(_name);
    String _plus = (_env + "/");
    final String privateKey = (_plus + "id_rsa");
    Runtime _runtime = Runtime.getRuntime();
    String _name_1 = machine.getName();
    final String host = DockerMachineManager.ipCmd(_runtime, _name_1);
    EList<Adapter> _eAdapters = container.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          DockerObserver.LOGGER.info("The Container has Changed");
          Object _notifier = notification.getNotifier();
          Container newContainer = ((Container) _notifier);
          String _name = newContainer.getName();
          final String containerId = DockerObserver.this.getContainerId(_name, machine);
          Object _oldValue = notification.getOldValue();
          String _plus = ("Ancienne Valeur : " + _oldValue);
          DockerObserver.LOGGER.info(_plus);
          Object _newValue = notification.getNewValue();
          String _plus_1 = ("Nouvelle Valeur : " + _newValue);
          DockerObserver.LOGGER.info(_plus_1);
          int _cores = DockerObserver.cpContainer.getCores();
          int _cores_1 = newContainer.getCores();
          boolean _equals = Integer.valueOf(_cores).equals(Integer.valueOf(_cores_1));
          boolean _not = (!_equals);
          if (_not) {
            final CPUManager cpuManager = new CPUManager();
            int _cores_2 = container.getCores();
            DockerObserver.cpContainer.setCores(_cores_2);
            int _cores_3 = newContainer.getCores();
            String _valueOf = String.valueOf(_cores_3);
            cpuManager.setCPUValue(host, privateKey, containerId, _valueOf);
          }
          float _speed = DockerObserver.cpContainer.getSpeed();
          float _speed_1 = newContainer.getSpeed();
          boolean _equals_1 = Float.valueOf(_speed).equals(Float.valueOf(_speed_1));
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            final CPUManager cpuManager_1 = new CPUManager();
            int _cores_4 = container.getCores();
            DockerObserver.cpContainer.setCores(_cores_4);
            float _speed_2 = newContainer.getSpeed();
            int _round = Math.round(_speed_2);
            String _valueOf_1 = String.valueOf(_round);
            cpuManager_1.setFreqValue(host, privateKey, containerId, _valueOf_1);
          }
          float _memory = DockerObserver.cpContainer.getMemory();
          float _memory_1 = newContainer.getMemory();
          boolean _equals_2 = Float.valueOf(_memory).equals(Float.valueOf(_memory_1));
          boolean _not_2 = (!_equals_2);
          if (_not_2) {
            final MemoryManager memoryManager = new MemoryManager();
            float _memory_2 = container.getMemory();
            DockerObserver.cpContainer.setMemory(_memory_2);
            float _memory_3 = newContainer.getMemory();
            String _valueOf_2 = String.valueOf(_memory_3);
            memoryManager.setMemValue(host, privateKey, containerId, _valueOf_2);
          }
        }
      });
    return container;
  }
  
  public String getContainerId(final String containerName, final Machine machine) {
    final DockerContainerManager dockerContainerManager = new DockerContainerManager();
    String _name = machine.getName();
    final List<com.github.dockerjava.api.model.Container> listContainers = dockerContainerManager.listContainer(_name);
    for (final com.github.dockerjava.api.model.Container c : listContainers) {
      {
        String contName = null;
        String[] _names = c.getNames();
        final String name = _names[0];
        final String linkName = "LinkTo";
        final int index = name.indexOf(linkName);
        if ((index == (-1))) {
          String _replaceAll = name.replaceAll("/", "");
          contName = _replaceAll;
        } else {
          int _length = linkName.length();
          int _plus = (index + _length);
          String _substring = name.substring(_plus);
          contName = _substring;
        }
        boolean _equalsIgnoreCase = contName.equalsIgnoreCase(containerName);
        if (_equalsIgnoreCase) {
          return c.getId();
        }
      }
    }
    return null;
  }
}
