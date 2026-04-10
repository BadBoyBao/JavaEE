package com.xpxp233.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ListDemo
 * @date 2026/04/08  17:38
 **/
public class ListDemo {
    public static void main(String[] args) {
        // 目标:掌握List集合的常用方法
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        System.out.println(list);

        // 插入
        list.add(2,"张三");
        System.out.println(list);

        // 删除
        list.remove(2); // 索引删除
        System.out.println(list);
        list.remove("张三"); //  值删除
        System.out.println(list);

        // 修改
        list.set(3,"小昭");
        System.out.println(list);

        // 获取
        System.out.println(list.get(3));


        System.out.println("---------------------------");

        // 遍历
        // 1.for
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }
        // 2.迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        // 增强 for
        for (String name : list) {
            System.out.println(name);
        }
        // lambda
        list.forEach(name -> System.out.println(name));

    }
}
