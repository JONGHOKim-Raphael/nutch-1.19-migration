/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nutch.indexwriter.elastic;

public interface ElasticConstants {
  String HOSTS = "host";
  String PORT = "port";
  String SCHEME = "scheme";
  
  String USER = "username";
  String PASSWORD = "password";
  String USE_AUTH = "auth";
  String INDEX = "index";
  String MAX_BULK_DOCS = "max.bulk.docs";
  String MAX_BULK_LENGTH = "max.bulk.size";
  String EXPONENTIAL_BACKOFF_MILLIS = "exponential.backoff.millis";
  String EXPONENTIAL_BACKOFF_RETRIES = "exponential.backoff.retries";
  String BULK_CLOSE_TIMEOUT = "bulk.close.timeout";
  String OPTIONS = "options";
}
