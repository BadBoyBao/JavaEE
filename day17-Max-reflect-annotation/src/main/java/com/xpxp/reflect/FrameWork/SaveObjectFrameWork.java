package com.xpxp.reflect.FrameWork;


import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file SaveObjectFrameWork
 * @date 2026/04/15  20:32
 * @email thexpxp233@qq.com
 **/
public class SaveObjectFrameWork {
    public static final String PATH_SRC = "day17-Max-reflect-annotation-proxy-End/src/obj.txt";

    public static void saveObject(Object obj) throws Exception {
        // 打印流
        PrintStream ps = new PrintStream(new FileOutputStream(PATH_SRC , true));
        // obj可能是学生,老师,或者狗
        // 只有反射可以知道对象有多少个字段
        // 1.获取Class对象
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("====================" + simpleName + "====================");
        // 2.获取Class所有字段
        Field[] fields = c.getDeclaredFields();
        // 3.遍历字段
        for (Field field : fields) {
            // 4.获取字段的值
            // 4.1获取字段名称
            String fieldName = field.getName();
            // 4.2获取字段值
            field.setAccessible(true);//  暴力反射
            Object fieldValue = field.get(obj) + "";

            ps.println(fieldName + ":" + fieldValue);

        }
        ps.close();

    }
}
