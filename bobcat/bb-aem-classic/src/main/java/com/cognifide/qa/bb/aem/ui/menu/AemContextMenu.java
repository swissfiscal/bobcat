package com.cognifide.qa.bb.aem.ui.menu;

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

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cognifide.qa.bb.constants.ConfigKeys;
import com.cognifide.qa.bb.constants.Timeouts;
import com.cognifide.qa.bb.provider.selenium.BobcatWait;
import com.cognifide.qa.bb.qualifier.CurrentScope;
import com.cognifide.qa.bb.qualifier.Frame;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.cognifide.qa.bb.utils.XpathUtils;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Represents context menu.
 */
@PageObject
@Frame("$cq")
public class AemContextMenu {

  private static final String MENU_OPTION_XPATH = "//span[text()=%s]";

  @Inject
  @CurrentScope
  private WebElement currentScope;

  @Inject
  private BobcatWait bobcatWait;

  @Inject
  private Actions actions;

  @Inject
  @Named(ConfigKeys.WEBDRIVER_DEFAULT_TIMEOUT)
  private int defaultTimeout;

  /**
   * Clicks the selected option in the context menu and waits until context menu disappears.
   *
   * @param option option to click
   * @return this context menu object
   */
  public AemContextMenu clickOption(final MenuOption option) {
    bobcatWait.withTimeout(Timeouts.BIG).until(input -> {
      try {
        currentScope.findElement(
            By.xpath(String.format(MENU_OPTION_XPATH,
                XpathUtils.quote(option.getLabel()))))
            .click();
        currentScope.isDisplayed();
        return false;
      } catch (NoSuchElementException e) {
        return true;
      }
    });

    return this;
  }

  /**
   * Opens context menu on desired WebElement
   *
   * @param webElement element with context menu to open
   * @return this context menu object
   */
  public AemContextMenu open(final WebElement webElement) {
    bobcatWait.withTimeout(Timeouts.BIG).until(webDriver -> {
      try {
        actions.contextClick(webElement).perform();
        return currentScope.isDisplayed();
      } catch (NoSuchElementException | StaleElementReferenceException e) {
        return false;
      }
    }, 2);
    return this;
  }
}
