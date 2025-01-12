package com.online.escuela.model.entityLogin.dto;

import java.util.Set;

import com.online.escuela.model.entityLogin.Rol;


public class UserDto {
    private Long id;
    private String username;
    private String email;
    private Set<Rol> roles;
    private String password;  

    public UserDto() {
    }

    public UserDto(Long id, String username, String email, Set<Rol> roles, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                ", password='" + password + '\'' +
                '}';
    }
}