/*
 *
 *
 * Copyright 2017 Symphony Communication Services, LLC.
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.symphonyoss.symphony.tools.rest.ui.addon;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.symphonyoss.symphony.tools.rest.ui.SrtImageRegistry;
import org.symphonyoss.symphony.tools.rest.ui.browser.BrowserManager;
import org.symphonyoss.symphony.tools.rest.ui.browser.IBrowserManager;
import org.symphonyoss.symphony.tools.rest.ui.selection.ISrtSelectionService;
import org.symphonyoss.symphony.tools.rest.ui.selection.SrtSelectionService;
import org.symphonyoss.symphony.tools.rest.util.home.ISrtHome;

public class UiAddOn
{
  @PostConstruct
  public void createControls(IEclipseContext context)
  {    
    context.set(ISrtHome.class, ContextInjectionFactory.make(UiSrtHome.class, context));
    context.set(IBrowserManager.class, ContextInjectionFactory.make(BrowserManager.class, context));
    context.set(ISrtSelectionService.class, ContextInjectionFactory.make(SrtSelectionService.class, context));
    context.set(SrtImageRegistry.class, ContextInjectionFactory.make(SrtImageRegistry.class, context));
  }
}
