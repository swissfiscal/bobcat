/*-
 * #%L
 * Bobcat
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
package com.cognifide.qa.bb.aem.ui.component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use this to annotate class bound to AemComponent in your project
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AemComponent {

  /**
   * A part of cssSelector, used to find a specific component in markup
   * @return css class
   */
  String cssClassName();

  /**
   * Component label visible in sidekick/insert window
   * @return component name
   */
  String name();

  /**
   * Name of components group in Sidekick/insert window which contains this component
   * @return component group
   */
  String group();

  /**
   * cssSelector used to locate the component in sidekick
   * @return sidekick selector
   */
  String sidekickCssSelector() default "";
}
