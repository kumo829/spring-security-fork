/* Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
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

package org.springframework.security.core.userdetails;

import org.springframework.security.core.AuthenticationException;


/**
 * Thrown if an {@link UserDetailsService} implementation cannot locate a {@link User} by its username.
 *
 * @author Ben Alex
 */
public class UsernameNotFoundException extends AuthenticationException {
    //~ Constructors ===================================================================================================

    /**
     * Constructs a <code>UsernameNotFoundException</code> with the specified
     * message.
     *
     * @param msg the detail message.
     */
    public UsernameNotFoundException(String msg) {
        super(msg);
    }

    /**
     * Constructs a <code>UsernameNotFoundException</code>, making use of the <tt>extraInformation</tt>
     * property of the superclass.
     *
     * @param msg the detail message
     * @param extraInformation additional information such as the username.
     */
    public UsernameNotFoundException(String msg, Object extraInformation) {
        super(msg, extraInformation);
    }

    /**
     * Constructs a <code>UsernameNotFoundException</code> with the specified
     * message and root cause.
     *
     * @param msg the detail message.
     * @param t root cause
     */
    public UsernameNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }
}
