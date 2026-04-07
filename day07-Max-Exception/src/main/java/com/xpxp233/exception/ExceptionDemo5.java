package com.xpxp233.exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ExceptionDemo5
 * @date 2026/04/07  16:33
 **/
public class ExceptionDemo5 {
    public static void show2() throws Exception {

        String str = "2004-07-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
        InputStream is = new FileInputStream("D:/meinv.png");
    }
    public static void main(String[] args) {
        // 目标:掌握异常的处理方案1:底层处理都抛出去给最外层调用者,最外层捕获异常,记录异常,响应合适信息给用户看
        System.out.println("===程序开始时...===");
        try {
            show2();
            System.out.println("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("操作失败");
        }
        System.out.println("===程序结束...===");
    }

}
