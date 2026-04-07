package com.xpxp233.exception;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ExceptionDemo3
 * @date 2026/04/07  16:01
 **/
public class ExceptionDemo3 {
    public static void main(String[] args) {
        // 目标:认识自定义异常
        try {
            show(2333);
            System.out.println("成功了~");
        } catch (XpXpAgeIllegalException e) {
           e.printStackTrace();
           System.out.println("失败了~");
        }
        System.out.println("程序结束");
    }
    // 需求:收到年龄小于1岁和大于200岁就是一个异常
    public static void show(int age) throws XpXpAgeIllegalException {
        if(age < 1 || age > 200){
            throw  new XpXpAgeIllegalException("年龄非法");
        }else {
            System.out.println("年龄合法");
            System.out.println("年龄是:" + age);

        }

    }
}
