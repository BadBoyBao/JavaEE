package com.xpxp.annotationDemo.annotation;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file A
 * @date 2026/04/15  20:51
 * @email thexpxp233@qq.com
 **/

// 自定义注解
public @interface MyBook {
    String name();

    int age() default 18;

    String[] address();
}
