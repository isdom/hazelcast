/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.spi.exception;

import com.hazelcast.core.HazelcastException;

public class RetryableHazelcastException extends HazelcastException implements RetryableException {

    public RetryableHazelcastException() {
    }

    public RetryableHazelcastException(String message) {
        super(message);
    }

    public RetryableHazelcastException(String message, Throwable cause) {
        super(message, cause);
    }

    public RetryableHazelcastException(Throwable cause) {
        super(cause);
    }
}
