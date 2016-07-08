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
package com.cognifide.bdd.demo.po.publish.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.aem.publish.PublishPage;
import com.cognifide.qa.bb.logging.ReportEntryLogger;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.google.inject.Inject;

@PageObject
public class ProductPage extends PublishPage {

  private static final String CONTENT_PATH =
      "/content/geometrixx-outdoors/en/men/shirts/ashanti-nomad.html";

  private static final String TITLE = "Ashanti Nomad";

  @Inject
  private ReportEntryLogger reportEntryLogger;

  @FindBy(css = "input[type='submit'][value='Add to Cart']")
  private WebElement addToCartButton;

  @Override
  public String getContentPath() {
    return adjustContentPath(CONTENT_PATH);
  }

  @Override
  public String getPageTitle() {
    return TITLE;
  }

  public void addToCart() {
    addToCartButton.click();
  }

}
