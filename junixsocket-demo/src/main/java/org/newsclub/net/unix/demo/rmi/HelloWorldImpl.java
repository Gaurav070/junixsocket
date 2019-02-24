/**
 * junixsocket
 *
 * Copyright 2009-2019 Christian Kohlschütter
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
package org.newsclub.net.unix.demo.rmi;

import java.io.IOException;

import org.newsclub.net.unix.demo.rmi.services.HelloWorld;

/**
 * The implementation of the very simple {@link HelloWorld} service.
 * 
 * @author Christian Kohlschütter
 */
public class HelloWorldImpl implements HelloWorld {
  @Override
  public String hello() throws IOException {
    System.out.println("Received call to hello()");
    return "Hello world";
  }
}