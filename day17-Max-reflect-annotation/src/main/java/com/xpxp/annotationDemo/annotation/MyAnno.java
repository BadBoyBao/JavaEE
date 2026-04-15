package com.xpxp.annotationDemo.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MyAnno
 * @date 2026/04/15  21:22
 * @email thexpxp233@qq.com
 **/

@Target(ElementType.METHOD) //  表示注解的作用范围
@Retention(RetentionPolicy.RUNTIME) // 表示注解的保留策略
public @interface MyAnno {
}
