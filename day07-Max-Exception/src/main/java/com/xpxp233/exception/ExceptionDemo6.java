package com.xpxp233.exception;


import java.util.Scanner;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ExceptionDemo6
 * @date 2026/04/07  16:48
 **/
public class ExceptionDemo6 {
    public static void main(String[] args) {
        // 目标:掌握异常的处理方案2:捕获异常对象,尝试重新修复
        // 接收用户的一个定价
        System.out.println("程序开始");
        while (true) {
            try {
                double v = UserInputPrice();
                System.out.println("您输入的价格是:" + v);
                break;
            } catch (Exception e) {
                System.out.println("您输入的数据是瞎搞的,请不要瞎输入");
            }
        }
        System.out.println("程序结束");
    }

    public static double UserInputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个价格:");
        return sc.nextDouble();

    }
}
