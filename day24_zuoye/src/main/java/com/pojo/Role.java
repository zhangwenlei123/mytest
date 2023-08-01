package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private Integer id;
    private String name;
    private String desc;

    //一个角色多个用户
    private Set<Privilege> privileges = new HashSet<>();

    //一个角色对应多个用户  ---->很少通过角色去查询用户
//    private Set<User> uses = new HashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<Privilege> privileges) {
        this.privileges = privileges;
    }
}
