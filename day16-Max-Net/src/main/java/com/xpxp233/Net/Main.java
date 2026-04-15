package com.xpxp233.Net;


import java.net.InetAddress;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/15  15:11
 * @email thexpxp233@qq.com
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
    }
}
