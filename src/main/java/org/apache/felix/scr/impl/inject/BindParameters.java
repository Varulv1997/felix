/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.scr.impl.inject;

import org.apache.felix.scr.impl.helper.SimpleLogger;
import org.apache.felix.scr.impl.manager.ComponentContextImpl;
import org.apache.felix.scr.impl.manager.RefPair;
import org.osgi.framework.BundleContext;

public class BindParameters
{

    private final ComponentContextImpl<?> componentContext;
    private final RefPair<?, ?> refPair;
    public BindParameters(ComponentContextImpl<?> componentContext, RefPair<?, ?> refPair)
    {
        this.componentContext = componentContext;
        this.refPair = refPair;
    }

    public ComponentContextImpl<?> getComponentContext()
    {
        return componentContext;
    }

    public RefPair getRefPair()
    {
        return refPair;
    }

    public Object getServiceObject() {
    	return refPair.getServiceObject((ComponentContextImpl) componentContext);
    }

    public boolean getServiceObject(BundleContext context, SimpleLogger logger) {
    	return refPair.getServiceObject((ComponentContextImpl) componentContext, context, logger);
    }
}
