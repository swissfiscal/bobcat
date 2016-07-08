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
package com.cognifide.bdd.demo.po.frame;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.qualifier.Frame;
import com.cognifide.qa.bb.qualifier.PageObject;

@PageObject
public class Interspersed {

  @FindBy(id = "frame-title")
  private WebElement title;

  @Frame("main-frame-1")
  public String mainFrame1() {
    // dummy call just to change scope for a while
    mainFrame2();
    return title.getText();
  }

  @Frame("main-frame-2")
  public String mainFrame2() {
    return title.getText();
  }

  @Frame("main-frame-3")
  public String mainFrame3() {
    return title.getText();
  }

  @Frame("/")
  public List<String> index() {
    List<String> titles = new ArrayList<>();
    titles.add(title.getText());
    titles.add(mainFrame1());
    titles.add(mainFrame2());
    titles.add(mainFrame3());
    titles.add(title.getText());
    return titles;
  }
}
