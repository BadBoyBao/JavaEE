package com.xpxp.annotationDemo;


import com.xpxp.annotationDemo.annotation.MyTest2;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file AnnotationDemo
 * @date 2026/04/15  21:22
 * @email thexpxp233@qq.com
 **/
public class AnnotationDemo {


    /**
     * 解析类上的注解
     *
     * @throws Exception
     */
    @Test
    public void parseDemo() throws Exception {
        // 1.获取类对象
        Class c1 = Demo.class;
        // 2.判断这个类上是否陈列了MyTest2注解
        if (c1.isAnnotationPresent(MyTest2.class)) {
            // 3.获取注解对象
            MyTest2 myTest2 = (MyTest2) c1.getDeclaredAnnotation((MyTest2.class));
            // 4.获取注解的属性值
            String[] address = myTest2.address();
            double price = myTest2.height();
            String value = myTest2.value();

            // 打印属性值
            System.out.println("value:" + value);
            System.out.println("price:" + price);
            System.out.println("address:" + Arrays.toString(address));
        }
    }

    /**
     * 解析方法上的注解
     */
    @Test
    public void parseMethodDemo() throws Exception {
        // 1.获取类对象
        Class c1 = Demo.class;
        // 2.获取方法对象
        Method method = c1.getMethod("go");
        // 3.判断这个方法上是否有注解MyTest2
        if (method.isAnnotationPresent(MyTest2.class)) {
            // 4.获取注解对象
            MyTest2 myTest2 = method.getDeclaredAnnotation(MyTest2.class);
            // 5.获取注解属性值
            String[] address = myTest2.address();
            double price = myTest2.height();
            String value = myTest2.value();

            // 打印出来
            System.out.println("value:" + value);
            System.out.println("price:" + price);
            System.out.println("address:" + Arrays.toString(address));

        }
    }

}
