package com.xpxp233;


import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ArrayListDemo1
 * @date 2026/04/07  12:31
 **/
public class ArrayListDemo1 {

    public static void main(String[] args) {
        // 掌握ArrayList集合的基本使用
        // 创建ArrayList对象,代表一个集合容器
        ArrayList<String> list = new ArrayList<>(); // 泛型定义集合
        // 添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add("赵明");
        System.out.println(list);
        // 查看数据  遍历

        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        // 删除数据
        // 1.1根据索引删除
        list.remove(4);
        System.out.println(list);
        // 1.2根据元素删除
        list.remove("java");
        System.out.println(list);
        // 修改数据
        list.set(0 , "hello world");
        System.out.println(list);

    }
}

