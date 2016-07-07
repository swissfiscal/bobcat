package com.cognifide.bdd.demo.aem.packages;

/*-
 * #%L
 * Bobcat Parent
 * %%
 * Copyright (C) 2016 Cognifide Ltd.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.cognifide.bdd.demo.GuiceModule;
import com.cognifide.qa.bb.aem.content.WcmCommandHandler;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class WcmCommandHandlerActivatorTest {

  public static final String ASSET_PATH = "/content/campaigns/geometrixx";

  @Inject
  private WcmCommandHandler activator;

  @Test
  public void activatePageTest() throws IOException {
    activator.activatePage(ASSET_PATH);
  }

  @Test
  public void deactivatePageTest() throws IOException {
    activator.deactivatePage(ASSET_PATH);
  }
}
