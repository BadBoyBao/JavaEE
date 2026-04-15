package com.xpxp.annotationDemo;


import com.xpxp.annotationDemo.annotation.MyTest;

import java.lang.reflect.Method;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file AnnotationDemo2
 * @date 2026/04/15  22:02
 * @email thexpxp233@qq.com
 **/
public class AnnotationDemo2 {
    public static void main(String[] args) throws Exception {
        AnnotationDemo2 annotationDemo2 = new AnnotationDemo2();
        // 目标:搞清楚注解的应用场景,案例:简单版junit框架,有MyTest注解的方法执行,否则不执行
        Class c1 = AnnotationDemo2.class;
        Method[] methods = c1.getMethods();
        // 遍历所有方法,判断方法上是否有MyTest注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                // 获取这个方法的注解
                MyTest myTest = method.getAnnotation(MyTest.class);
                int count = myTest.count();
                for (int i = 0 ; i < count ; i++) {
                    method.invoke(annotationDemo2);
                }
            }
        }
    }


    @MyTest
    public void test1() {
        System.out.println("test1方法执行了");
    }


    public void test2() {
        System.out.println("test2方法执行了");
    }

    @MyTest(count = 5)
    public void test3() {
        System.out.println("test3方法执行了");
    }


    @MyTest
    public void test4() {
        System.out.println("test4方法执行了");
    }

}
