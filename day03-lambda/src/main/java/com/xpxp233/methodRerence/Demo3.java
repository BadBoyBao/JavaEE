package com.xpxp233.methodRerence;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Demo3
 * @date 2026/04/02  11:55
 **/
public class Demo3 {
    public static void main(String[] args) {
        // 目标:特定类型的方法引用
        // 字符串数组,10个不同的英文名
        String[] names = { "Tom" , "Jerry" , "Mike" , "Mary" , "Tom" , "Jerry" , "Mike" , "Mary" , "Tom" , "Jerry","caocao","曹操","吕布","你好" };
        // 需求,请按照名字的首字母升序进行排序,忽略首字母的大小(Java官方是搞不定的,需要我们自己指定比较规则)
//        Arrays.sort(names , new Comparator<String>() {
//            @Override
//            public int compare(String o1 , String o2) {
//                // 01 Tom
//                // 02 Jerry
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
        Arrays.sort(names , String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

}
