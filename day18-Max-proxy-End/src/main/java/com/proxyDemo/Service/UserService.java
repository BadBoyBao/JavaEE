package com.proxyDemo.Service;


import com.proxyDemo.DTO.User;

import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file UserService
 * @date 2026/04/16  11:51
 * @email thexpxp233@qq.com
 **/
public interface UserService {

    // 登录
    void login(String username , String password);

    // 查询指定用户
    User queryUser(String username);

    // 查询全部用户
    ArrayList<User> queryAllUser();
}
