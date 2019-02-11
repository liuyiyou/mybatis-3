/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * refer: https://www.cnblogs.com/hzhuxin/p/3352758.html
 * @author Clinton Begin
 */
public enum TransactionIsolationLevel {
  //表示不支持事务的常量
  NONE(Connection.TRANSACTION_NONE),
  //不可重复读和虚读可以发生
  READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),
  //表示可以发生脏读 (dirty read)、不可重复读和虚读 (phantom read) 的常量
  READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),
  //虚读可以发生
  REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),
  //指示不可以发生脏读、不可重复读和虚读的常量。
  SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE);

  private final int level;

  private TransactionIsolationLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
