package com.xpxp233;


import com.xpxp233.pojo.MyArrayList;

import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Genericity
 * @date 2026/04/07  17:03
 **/
public class Genericity2 {
    public static void main(String[] args) {
        // 目标:学会自定义泛型类
        // 需求:请你模拟ArrayList集合自定义一个MyArrayList集合类
        MyArrayList<String> myArrayList = new MyArrayList(); // 从JDK7开始,后面的泛型参数可以省略

        myArrayList.add("hello");
        myArrayList.add("world");
        myArrayList.add("java");
        System.out.println(myArrayList.remove("hello"));
        System.out.println(myArrayList);
    }

}
