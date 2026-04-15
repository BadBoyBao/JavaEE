package com.xpxp;


import com.xpxp.DTO.Star;
import com.xpxp.Service.StarService;
import com.xpxp.Utils.ProxyUtils;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/15  22:26
 * @email thexpxp233@qq.com
 **/
public class Main {
    public static void main(String[] args) {
        // 目标:创建代理对象
        // 1.准备一个明星对象,设计明星类
        Star star = new Star("章若楠");
        // 2.为章若楠创建一个代理对象
        StarService proxy = ProxyUtils.createProxy(star);
        proxy.sing("小苹果");
        System.out.println(proxy.dance());


    }
}
