package com.xpxp233.Utils;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file StringUtlis
 * @date 2026/04/07  11:34
 **/
public class StringUtils {
    public static void main(String[] args) {
        // 目标生成验证码
        String code = getVerifyCode(4);
        System.out.println(code);
        System.out.println(getVerifyCode(6));
    }
    // 帮我生成指定位数验证码返回,每位可能是大小写字母或者数字
    // 帮我用String变量记住全部要用到的字符
    public static String getVerifyCode(int length){
        // 1.定义一个变量保存所有可用的字符
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // 2.定义一个变量用于记住验证码的随机字符
        String code = "";
        // 3.循环N次,每次随机一个字符,拼接
        for (int i = 0; i < length; i++) {
            // 4.随机一个索引
            int index = (int)(Math.random() * str.length());
            // 5.获取随机字符,拼接字符串
            code += str.charAt(index);
        }
        // 6.返回验证码
        return code;
    }
}
