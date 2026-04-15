package com.xpxp.annotationDemo.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MyTest2
 * @date 2026/04/15  21:34
 * @email thexpxp233@qq.com
 **/
@Target({ ElementType.METHOD , ElementType.TYPE }) //  作用范围
@Retention(RetentionPolicy.RUNTIME) //  保留时间
public @interface MyTest2 {
    String value();

    double height() default 178;

    String[] address();
}
