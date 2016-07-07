package com.cognifide.bdd.demo.po.login;

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


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.constants.AemConfigKeys;
import com.cognifide.qa.bb.aem.AemAuthCookieFactory;
import com.cognifide.qa.bb.qualifier.CurrentScope;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.google.inject.Inject;
import com.google.inject.name.Named;

@PageObject
public class UserDialog {

  @FindBy(partialLinkText = "Sign Out")
  private WebElement logoutButton;

  @FindBy(className = "endor-Account-name")
  private WebElement accountName;

  @Inject
  @Named(AemConfigKeys.AUTHOR_URL)
  private String authorUrl;

  @Inject
  private AemAuthCookieFactory aemAuthCookieFactory;

  @Inject
  @CurrentScope
  private WebElement currentWebElement;

  public UserDialog signOut() {
    logoutButton.click();
    aemAuthCookieFactory.removeCookie(authorUrl);
    return this;
  }

  public WebElement getAccountName() {
    return accountName;
  }
}
