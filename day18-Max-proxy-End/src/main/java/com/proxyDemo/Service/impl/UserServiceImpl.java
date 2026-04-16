package com.proxyDemo.Service.impl;


import com.proxyDemo.DTO.User;
import com.proxyDemo.Service.UserService;

import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file UserServiceImpl
 * @date 2026/04/16  11:53
 * @email thexpxp233@qq.com
 **/
public class UserServiceImpl implements UserService {

    @Override
    public void login(String username , String password) {
        if (username != null && password != null) {
            System.out.println("用户名:" + username + " 密码:" + password);
            System.out.println("登录成功");
        }
    }

    @Override
    public User queryUser(String username) {
        if (username != null) {
            System.out.println("用户名:" + username);
            System.out.println("查询成功");
            return new User(username , "123456");
        }
        return null;
    }

    @Override
    public ArrayList<User> queryAllUser() {
        System.out.println("查询所有用户");
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("xpxp233" , "123456"));
        list.add(new User("123123" , "123456"));
        return list;
    }
}
