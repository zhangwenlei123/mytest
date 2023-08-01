package com.dao;

import com.pojo.Privilege;

import java.util.ArrayList;
import java.util.List;

public class PrivilegeDao {
    /**
     * 添加权限
     */
    public void addPrivilege(Privilege privilege){
        System.out.println("添加权限");
    }

    /**
     * 根据查询权限
     */
    public Privilege getPrivilegeById(Integer id){
        System.out.println("id查询权限");
        return new Privilege();
    }

    /**
     * 查询出所有的权限 --->权限的分配的
     */
    public List<Privilege> findAll(){
        System.out.println("查询所有的权限");
        return  new ArrayList<>();
    }

    //修改,删除

}
