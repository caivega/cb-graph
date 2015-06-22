/*
 * Copyright 2015 Couchbase, Inc.
 *
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
 */

package com.couchbase.graph.test.annotation;

/**
 *
 * @author David Maier <david.maier at couchbase.com>
 */
import com.couchbase.graph.test.IChecker;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@java.lang.annotation.Retention(value = RUNTIME)
@java.lang.annotation.Target(value = {METHOD, TYPE})
public @interface RunIf {
   
    Class<? extends IChecker> value();

    String[] arguments() default {};
}
