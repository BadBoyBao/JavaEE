package com.xpxp233.methodRerence;


import com.xpxp233.po.Student;

import java.util.Arrays;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Demo2
 * @date 2026/04/02  11:47
 **/
public class Demo2 {
    public static void main(String[] args) {
        // 实例方法引用

        test();

    }
    public static void test(){
        Student[] students = new Student[6];
        students[0] = new Student("thexpxp233" , 22 , 177.8 , "男");
        students[1] = new Student("xpxpya" , 22 , 177.8 , "男");
        students[2] = new Student("张三" , 21 , 175.8 , "女");
        students[3] = new Student("李四" , 23 , 173.8 , "男");
        students[4] = new Student("王五" , 24 , 172.8 , "女");
        students[5] = new Student("老刘" , 25 , 174.8 , "男");

        Student t = new Student();
        Arrays.sort(students ,t::compareByHeight);

//         Arrays.sort(students,Student::compareByAge);

        for (int i = 0 ; i < students.length ; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
