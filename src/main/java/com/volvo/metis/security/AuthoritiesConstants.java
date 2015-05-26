package com.volvo.metis.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    private AuthoritiesConstants() {
    }

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String DEALER = "ROLE_DEALER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";
}
