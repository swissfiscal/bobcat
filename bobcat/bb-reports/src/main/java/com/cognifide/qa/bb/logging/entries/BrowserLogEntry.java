package com.cognifide.qa.bb.logging.entries;

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
 * Entry that represents an browser information that appeard during execution of the test.
 */
public class BrowserLogEntry extends LogEntry {

  private final String message;

  /**
   * Construct BrowserLogEntry
   *
   * @param message message retrieved from log entry
   */
  public BrowserLogEntry(String message) {
    this.message = message;
  }

  /**
   *
   * @return Entry message
   */
  public String getMessage() {
    return message;
  }
}
