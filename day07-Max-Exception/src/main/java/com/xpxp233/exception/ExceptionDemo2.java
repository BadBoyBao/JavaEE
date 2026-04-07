package com.xpxp233.exception;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ExceptionDemo2
 * @date 2026/04/07  15:49
 **/
public class ExceptionDemo2 {
    public static void main(String[] args) {
        // 目标:搞清楚异常的作用
        System.out.println("程序开始=====");
        try {
            System.out.println(div(10,0));
            System.out.println("底层方法执行成功~~~");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败了~~~");
        }
        System.out.println("程序结束执行");
    }
    // 需求:求2个数的除的结果,并返回这个结果
    public static int div(int a,int b) throws Exception {
        if(b == 0){
            throw new Exception("除数不能为0");
        }
        return a/b;
    }
}
