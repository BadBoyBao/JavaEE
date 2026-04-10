package com.xpxp233.Set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file SetDemo
 * @date 2026/04/09  10:51
 **/
public class LinkedSetDemo {
    public static void main(String[] args) {
        // 目标:认识set家族集合
        // LinkedHashSet:有序、不重复,无索引
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
