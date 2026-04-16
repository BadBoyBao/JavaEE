package com.proxyDemo;


import com.proxyDemo.Proxy.ProxyUtils;
import com.proxyDemo.Service.UserService;
import com.proxyDemo.Service.impl.UserServiceImpl;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/16  11:50
 * @email thexpxp233@qq.com
 **/
public class Main {
    public static void main(String[] args) {
        // 目标:动态代理解决问题思想
        UserService proxy = ProxyUtils.createProxy(new UserServiceImpl());
        proxy.login("xpxp233" , "123456");
        proxy.queryUser("xpxp233");
        System.out.println(proxy.queryAllUser());


    }
}
