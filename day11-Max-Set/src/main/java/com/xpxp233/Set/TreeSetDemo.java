package com.xpxp233.Set;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file SetDemo
 * @date 2026/04/09  10:51
 **/
public class TreeSetDemo {
    public static void main(String[] args) {
        // 目标:认识set家族集合
        // TreeSet:排序(默认一定要从小到大升序排序),不重复,无索引
        Set<Double> set = new TreeSet<>();
        set.add(1.0);
        set.add(5.1);
        set.add(3.01);
        set.add(2.0);
        set.add(4.0);
        System.out.println(set);
    }
}
