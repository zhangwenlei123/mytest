package com.dao;

import com.pojo.Privilege;
import com.pojo.Role;
import com.pojo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDao {
    public void addUser(User user){
        System.out.println("增加用户");
    }

    public void findUser(Integer id){
        System.out.println("查询用户");
    }

    /**
     * 获得权限 --->获得角色--->根据角色去查询对应的权限
     *  ===>可以封装service层
     *
     *  ===>把dao换成springDataJPA,而且要写service和controll层
     */
    public List<Privilege> getRole(Integer user_id){  //没有实体类对应,对应的表是 user_role
          //自己写SQL语句
        //1.查询所有角色的ID
        String sql = "select * from user_role where user_id =?";  //role_id
        //role_id;  //可能是多个--->涉及成多个
        //2.根据角色ID--->角色信息  可以省略的
        RoleDao roleDao = new RoleDao();
       // roleDao.findByID(id);
        //List list = new ArrayList();
        //3.根据角色ID --->查询出权限的ID  -->自己写SQL
        String sql2 = "select * from role_privilege where role_id =?";  //role_id
        //权限的ID --->是一个集合
        //4.根据权限的ID查询多有的权限
        //Arrays<Privilege> list2;
         return null;
    }

    //登录的时候  user --->权限  没有权限,就不让他登录
}
