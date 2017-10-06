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

import javax.inject.Inject;

import org.symphonyoss.symphony.tools.rest.console.Console;
import org.symphonyoss.symphony.tools.rest.ui.console.IConsole;
import org.symphonyoss.symphony.tools.rest.ui.console.IConsoleManager;
import org.symphonyoss.symphony.tools.rest.ui.console.SwtConsole;
import org.symphonyoss.symphony.tools.rest.util.home.SrtHome;

public class UiSrtHome extends SrtHome
{
  @Inject
  public UiSrtHome(IConsoleManager consoleManager)
  {
    super(getConsole(consoleManager));
  }

  private static Console getConsole(IConsoleManager consoleManager)
  {
    IConsole iConsole = consoleManager.createConsole();
    
    return new SwtConsole(null, null, iConsole.getIn(), iConsole.getOut(), iConsole.getErr());
  }
}
