package com.xpxp233.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Student
 * @date 2026/04/02  10:42
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private Double height;
    private String sex;

    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
    public int compareByHeight(Student s1, Student s2) {
        // 按照身高比较
        return Double.compare(s1.getHeight(), s2.getHeight());
    }
}
