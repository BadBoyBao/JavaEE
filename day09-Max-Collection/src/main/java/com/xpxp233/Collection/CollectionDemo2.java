package com.xpxp233.Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CollectionDemo2
 * @date 2026/04/08  11:51
 **/
public class CollectionDemo2 {
    public static void main(String[] args) {
        // 目标:搞清楚Collection提供的通用集合功能
        Collection<String > list = new ArrayList<>();
        // 添加元素
        list.add("张三");
        list.add("王五");
        list.add("李四");
        System.out.println(list);

        // 获取集合元素
        System.out.println(list.size());
        // 删除元素
        list.remove("张三");
        System.out.println(list);

        // 判断集合是否为空
        System.out.println(list.isEmpty());

        // 清空集合
//        list.clear();

        // 判断集合是否存在某个数据
        System.out.println(list.contains("王五"));

        // 把集合转换成数组
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));

    }
}
