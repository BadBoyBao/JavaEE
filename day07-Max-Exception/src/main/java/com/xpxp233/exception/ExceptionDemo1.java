package com.xpxp233.exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ExceptionDemo1
 * @date 2026/04/07  15:24
 **/
public class ExceptionDemo1 {

    public static void main(String[] args)  {
        // 目标:认识异常的体系,搞清楚异常的基本作用
//        show();
        try {
            show2();
        } catch (Exception e) {
            e.printStackTrace(); //  输出异常信息
        }
    }

    // 定义一个方法认识运行时异常
    public static void show() {
        System.out.println("===程序开始时...===");
        int[] arr = { 1 , 2 , 3 };
//        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException异常
//        System.out.println(10/0); // ArithmeticException异常
        // 空指针异常  NullPointerException
        String str = null;
        System.out.println(str.charAt(0));
        System.out.println(str.length());


        System.out.println("===程序运行结束...===");

    }
    // 定义一个方法认识编译时异常
    public static void show2() throws Exception {
        System.out.println("===程序开始时...===");
        String str = "2004-07-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
        InputStream is = new FileInputStream("D:/meinv.png");
    }
}
