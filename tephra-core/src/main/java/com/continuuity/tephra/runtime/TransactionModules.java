/*
 * Copyright 2012-2014 Continuuity, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.continuuity.tephra.runtime;

import com.google.inject.Module;

/**
 * Provides access to Google Guice modules for in-memory, single-node, and distributed operation.
 */
public class TransactionModules {
  public TransactionModules() {
  }

  public Module getInMemoryModules() {
    return new TransactionInMemoryModule();
  }

  public Module getSingleNodeModules() {
    return new TransactionLocalModule();
  }

  public Module getDistributedModules() {
    return new TransactionDistributedModule();
  }
}
