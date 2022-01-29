package com.mali.authmodul.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * Pass the User information to Spring security
 */
public class UserPrincipal implements UserDetails {
    private User user;

    public UserPrincipal(User user) {
        this.user = user;
    }

    /**
     * getAuthorities returns String and each authority mapping to SimpleGrantedAuthority
     * Finally all SimpleGrantedAuthority objects represent as List
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return stream(this.user.getAuthorities()).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // TODO: for now
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.user.isNotLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // TODO: for now
    }

    @Override
    public boolean isEnabled() {
        return this.user.isEnabled();
    }
}
