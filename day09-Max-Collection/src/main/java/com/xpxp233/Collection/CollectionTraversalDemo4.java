package com.xpxp233.Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CollectionTraversalDemo
 * @date 2026/04/08  12:03
 **/
public class CollectionTraversalDemo3 {
    public static void main(String[] args) {
       // 目标:掌握Collection集合的遍历方式3:Lambda表达式
        Collection<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("殷素素");
        list.forEach(System.out::println);

    }
}
