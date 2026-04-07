package com.xpxp.code01.lambda;


import com.xpxp.code01.po.Student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file LamdbaDemo2
 * @date 2026/04/02  10:40
 **/
public class LambdaDemo2 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("thexpxp233" , 22 , 177.8 , "男");
        students[1] = new Student("xpxpya" , 22 , 177.8 , "男");
        students[2] = new Student("张三" , 21 , 175.8 , "女");
        students[3] = new Student("李四" , 23 , 173.8 , "男");
        students[4] = new Student("王五" , 24 , 172.8 , "女");
        students[5] = new Student("老刘" , 25 , 174.8 , "男");

        Arrays.sort(students , new Comparator<Student>() {
            @Override
            public int compare(Student o1 , Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        Arrays.sort(students , (Student o1 , Student o2) -> {
            return o1.getAge() - o2.getAge();
        });
        Arrays.sort(students , (o1 , o2) ->  o1.getAge() - o2.getAge());

        for (int i = 0 ; i < students.length ; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
