package com.xpxp233;


import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Genericity
 * @date 2026/04/07  17:03
 **/
public class Genericity {
    public static void main(String[] args) {
        // 目标:认识泛型,搞清楚使用泛型的好处
        // 1.定义一个类,类中定义一个方法,这个方法可以接收任意类型的参数
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("10.5");
        // 2.获取数据
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);

        }
    }
}
