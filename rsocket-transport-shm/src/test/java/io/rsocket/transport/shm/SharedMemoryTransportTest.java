/// *
// * Copyright 2015-2018 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
// package io.rsocket.transport.shm;
//
// import io.rsocket.test.TransportTest;
// import java.time.Duration;
//
//// final class SharedMemoryTransportTest implements TransportTest {
////
////  private final TransportPair transportPair =
////      new TransportPair<>(
////          () -> 8080,
////          (address, server, allocator) -> SharedMemoryClientTransport.create(address,
// allocator),
////          SharedMemoryServerTransport::create);
////
////  @Override
////  public Duration getTimeout() {
////    return Duration.ofMinutes(2);
////  }
////
////  @Override
////  public TransportPair getTransportPair() {
////    return transportPair;
////  }
//// }
