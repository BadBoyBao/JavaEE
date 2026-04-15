package com.xpxp.annotationDemo;


import com.xpxp.annotationDemo.annotation.A;
import com.xpxp.annotationDemo.annotation.MyBook;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/15  20:51
 * @email thexpxp233@qq.com
 **/
public class Main {

    @MyBook(name = "xpxp", age = 18, address = { "广州" , "荔湾" })
    @A("delete")
    public static void main(String[] args) {
        // 目标:自定义注解
    }
}
