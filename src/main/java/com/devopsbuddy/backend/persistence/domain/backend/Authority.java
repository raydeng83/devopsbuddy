package com.devopsbuddy.backend.persistence.domain.backend;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by lede on 8/4/16.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
