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
 * A simple info entry.
 */
public class InfoEntry extends LogEntry {

  private String message;

  /**
   * Constructs an InfoEntry.
   *
   * @param message info description
   */
  public InfoEntry(String message) {
    super();
    this.message = message;
  }

  /**
   * @return The message that the user attached to the entry.
   */
  public String getMessage() {
    return message;
  }
}
