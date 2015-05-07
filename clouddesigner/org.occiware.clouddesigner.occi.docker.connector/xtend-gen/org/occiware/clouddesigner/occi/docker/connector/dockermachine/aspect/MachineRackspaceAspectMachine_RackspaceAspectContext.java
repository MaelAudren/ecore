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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineRackspaceAspectMachine_RackspaceAspectProperties;

@SuppressWarnings("all")
public class MachineRackspaceAspectMachine_RackspaceAspectContext {
  public final static MachineRackspaceAspectMachine_RackspaceAspectContext INSTANCE = new MachineRackspaceAspectMachine_RackspaceAspectContext();
  
  public static MachineRackspaceAspectMachine_RackspaceAspectProperties getSelf(final Machine_Rackspace _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineRackspaceAspectMachine_RackspaceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_Rackspace, MachineRackspaceAspectMachine_RackspaceAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_Rackspace, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineRackspaceAspectMachine_RackspaceAspectProperties>();
  
  public Map<Machine_Rackspace, MachineRackspaceAspectMachine_RackspaceAspectProperties> getMap() {
    return map;
  }
}
