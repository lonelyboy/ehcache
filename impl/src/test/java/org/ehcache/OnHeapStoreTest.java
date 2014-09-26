/*
 * Copyright Terracotta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ehcache;

import org.ehcache.internal.store.OnHeapStore;
import org.ehcache.spi.cache.Store;
import org.ehcache.spi.test.StoreFactory;
import org.ehcache.spi.test.StoreTester;
import org.junit.Test;

/**
 * @author Hung Huynh
 */
public class OnHeapStoreTest {

  @Test
  public void test() throws Exception {
    StoreTester tester = new StoreTester(new StoreFactory() {
      @Override
      public <K, V> Store<K, V> newStore(Store.Configuration<K, V> config) {
        return new OnHeapStore<K, V>(config);
      }
    });
    tester.runTestSuite().reportAndThrow();
  }

}
