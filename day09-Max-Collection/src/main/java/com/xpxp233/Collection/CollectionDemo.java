package com.xpxp233.Collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Collection
 * @date 2026/04/08  11:20
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        // 搞清楚collection集合的整体特点
        // 1.List家族的集合: 有序,可重复,可索引
        List<String > list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Java");
        System.out.println(list); // [Java, C++, Python, Java] 顺序和添加的顺序一致

        // 2.Set家族的集合: 无序,不可重复,无索引
        Set<String> set = new HashSet<>();
        set.add("鸿蒙");
        set.add("Java");
        set.add("C");
        set.add("PHP");

        set.add("C++");
        set.add("Python");
        set.add("Java");
        System.out.println(set);
    }
}
