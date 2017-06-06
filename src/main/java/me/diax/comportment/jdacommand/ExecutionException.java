/*
 * Copyright 2017 Comportment | comportment@diax.me
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

package me.diax.comportment.jdacommand;

/**
 * This represents an {@link Exception} that occurs when an error with JDA-Command occurs.
 *
 * @author Comportment
 * @since 1.0.0
 */
public class ExecutionException extends RuntimeException {
    private static final long serialVersionUID = -3419515084851063729L;

    /**
     * Constructor for an {@link ExecutionException}.
     *
     * @see RuntimeException(String, Throwable)
     * @since 1.0.3
     */
    ExecutionException(Throwable cause) {
        super(cause);
    }
}