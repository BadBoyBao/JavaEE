package com.xpxp233.GenericityDemo04;


import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/08  10:07
 **/
public class Main {
    public static void main(String[] args) {
        test2();


    }
    public static void test(){
        // 目标:搞清楚泛型和集合不支持基本数据类型的问题,只能支持对象类型(引用数据类型)
        ArrayList<Integer> list = new ArrayList<>();
        // 泛型擦除: 泛型工作在编译阶段,等编译后泛型没用了   泛型擦除是在编译期间完成的,编译期间会自动将泛型参数替换为Object

        // 基本数据类型变成包装类
        // 手动包装:
//        Integer i = new Integer(1000); // 过时
        Integer it = Integer.valueOf(100);
        Integer it2 = 100;
        System.out.println(it==it2);
        // 自动包装: 自动装箱成对象,基本数据类型的数据可以直接变成包装对象的数据,不需要额外做任何事情
        Integer i = 130;
        Integer i2 = 130;
        System.out.println(i==i2);
        // 自动拆箱:把包装类型的对象直接给基本数据类型变量
        int i3 = i;
        System.out.println(i3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        int rs = list2.get(1);
        System.out.println("----------------------------");

        // 包装类新增的功能
        // 1.基本类型的数据转换成字符串
        int j = 23;
        String string = Integer.toString(j);
        System.out.println(string);
        System.out.println(string+1);

        Integer q2 = j;
        String rs2 = q2.toString(); // "23"
        System.out.println(rs2+1); // 231

        String rs3 = q2 + "";
        System.out.println(rs3+1); //  231
        System.out.println("----------------------------");
    }
    public static void test2(){
        // 2.字符串数值转换成对应基本数据类型(很有用)
        String str = "98";
        int i1 = Integer.parseInt(str);
        int i2 = Integer.valueOf(str);
        System.out.println(i1 + 2);

        String str2 = "98.8";
        Double d1 = Double.valueOf(str2);
        System.out.println(d1);
    }
}
