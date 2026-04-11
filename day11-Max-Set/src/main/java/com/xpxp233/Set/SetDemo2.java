package com.xpxp233.Set;


import com.xpxp233.DTO.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file SetDemo2
 * @date 2026/04/11  11:36
 * @email thexpxp233@qq.com
 **/
public class SetDemo2 {
    public static void main(String[] args) {
        // 掌握Set去重的操作
        Student s1 = new Student("张三", 18, "上海", "1555555");
        Student s2 = new Student("张三", 18, "上海", "1555555");
        Student s3 = new Student("李四", 18, "上海", "1333333");
        Student s4 = new Student("李四", 18, "上海", "1333333");

        Set< Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}
