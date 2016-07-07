package com.cognifide.qa.bb.logging;

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


/**
 * Represents failure of a test.
 */
public class Fail implements TestResult {

  private final String message;

  /**
   * Constructs the Fail instance with attached message.
   *
   * @param message reason for test failure
   */
  public Fail(String message) {
    this.message = message;
  }

  /**
   * Constructs a Fail instance without additional message.
   */
  public Fail() {
    this("");
  }

  @Override
  public String toString() {
    return String.format("NOK (%s)", message);
  }

  /**
   * @return Failure message.
   */
  public String getMessage() {
    return message;
  }
}
