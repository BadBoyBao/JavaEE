package com.xpxp233.LinkedSet;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file LinkedSetDemo
 * @date 2026/04/11  12:07
 * @email thexpxp233@qq.com
 **/
public class LinkedSetDemo {
    public static void main(String[] args) {
        // 目标:认识LinkedHashSet
        // LinkedHashSet:有序、不重复、无索引
        Set<String> set = new LinkedHashSet<>();
        set.add("鸿蒙");
        set.add("Java");
        set.add("Java");
        set.add("C++");
        set.add("C");
        set.add("PHP");
        set.add("C++");
        set.add("电商设计");
        System.out.println(set);
    }
}
