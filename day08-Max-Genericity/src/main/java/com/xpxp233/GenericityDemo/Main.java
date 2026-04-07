package com.xpxp233.GenericityDemo;


import com.xpxp233.GenericityDemo.DTO.Student;
import com.xpxp233.GenericityDemo.Service.impl.StudentData;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/07  17:48
 **/
public class Main {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.remove(new Student());
        studentData.update(new Student());
        studentData.query(1);
    }
}
