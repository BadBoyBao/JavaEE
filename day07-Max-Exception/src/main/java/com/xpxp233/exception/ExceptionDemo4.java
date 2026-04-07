package com.xpxp233.exception;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ExceptionDemo3
 * @date 2026/04/07  16:01
 **/
public class ExceptionDemo4 {
    public static void main(String[] args) {
        // 目标:认识自定义异常-运行时异常
        try {
            show(2333);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 需求:收到年龄小于1岁和大于200岁就是一个异常
    public static void show(int age){
        if(age < 1 || age > 200){
            throw  new XpXpAgeIllegalRunTimeException("年龄非法");
        }else {
            System.out.println("年龄合法");
            System.out.println("年龄是:" + age);

        }

    }
}
