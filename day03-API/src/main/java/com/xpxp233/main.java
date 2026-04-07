package com.xpxp233;


import java.util.Scanner;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file main
 * @date 2026/04/02  15:12
 **/
public class main {
    public static void main(String[] args) {

        // 1.推荐方式
        String s1 = "hello world";
        System.out.println(s1);
        System.out.println(s1.length());


        // 2.不推荐方式
        String s2 = new String();
        System.out.println(s2);//  空字符

        String s3 = new String("hello ,world");
        System.out.println(s3);

        char[] chars = { 'h' , 'e' , 'l' , 'l' , 'o' , ' ' , 'w' , 'o' , 'r' , 'l' , 'd' };
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = { 97 , 98 , 99 , 100 , 101 , 102 };
        String s5 = new String(bytes);
        System.out.println(s5);

        System.out.println("==================================================");


        // 只有 " " 给出的字符串对象放在字符串常量池,相同内容只放一个
        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);

        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);

        System.out.println("==================================================");

        //  简易版登录
        String username = "admin";
        System.out.println("请输入您的登录名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // 字符串对象的内容比较,千万不要用 == ,== 比较的是对象地址,字符串对象的内用一样时地址不一样
        // 判断你字符串内容,建议大家用String 提供的 equals 方法,只关心内容一样,就返回true,不关心地址
        if (name.equals(username)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        System.out.println("==================================================");

        // 13242774891 -> 132******91
        System.out.println("请输入您的电话号码");
        String phone = sc.next();
        System.out.println("系统显示一下手机号码");
        String newPhone = phone.substring(0,3) + "******" + phone.substring(7);
        System.out.println(newPhone);

    }
}
