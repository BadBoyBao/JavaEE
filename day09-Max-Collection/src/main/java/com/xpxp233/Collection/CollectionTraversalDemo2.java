package com.xpxp233.Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CollectionTraversalDemo
 * @date 2026/04/08  12:03
 **/
public class CollectionTraversalDemo2 {
    public static void main(String[] args) {
       // 目标:掌握Collection集合的遍历方式2:增强for
        Collection<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("殷素素");
        for (String s : list) {
            System.out.println(s);
        }
        String[] names = {"张无忌", "周芷若", "赵敏", "张强", "张三丰", "殷素素"};
        for (String name : names) {
            System.out.println(name);
        }

    }
}
