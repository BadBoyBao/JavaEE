package com.xpxp233.GenericityDemo02;


import com.xpxp233.GenericityDemo.DTO.Student;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/07  18:10
 **/
public class Main {
    public static void main(String[] args) {

        // 目标:学会泛型方法,搞清楚作用
        // 需求打印任意数组内容
        String[] names = {"赵敏", "小昭", "小華"};
        printArray(names);

        Student[] s = new Student[3];
        printArray(s);

        Student s1 = getMax(s);
        String max = getMax(names);

    }
    public static <E> void printArray(E[] array){
    }

    public static <T> T getMax(T[]  array){
        return null;
    }
}
