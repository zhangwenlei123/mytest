package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Integer id;
    private String  username;
    private String password;

    //一个用户可以是多个角色,更多的是我想知道用户有什么角色--->权限
    private Set<Role> roles = new HashSet<Role>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
