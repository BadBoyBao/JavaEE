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
public class CollectionTraversalDemo4 {
    public static void main(String[] args) {
       // 目标:掌握认识并发修改集合的并发修改异常
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("Java进阶");
        list.add("Java实战");
        list.add("Java面试");
        list.add("枸杞");
        list.add("黑枸杞");
        list.add("宁夏枸杞");
        list.add("西洋参");
        System.out.println(list); // [Java入门, Java进阶, Java实战, Java面试, 枸杞, 黑枸杞, 宁夏枸杞, 西洋参]
        // 需求1:删除全部枸杞
//        for (int i = 0; i < list.size(); i++) {  出现异常
//            String name = list.get(i);
//            if(name.contains("枸杞")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list); //   [Java入门, Java进阶, Java实战, Java面试, 黑枸杞, 西洋参]


//        System.out.println("=================================");
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if(name.contains("枸杞")){
//                list.remove(name);
//                i--; // 解决方法1: 删除元素时,i--,重新开始循环 支持索引
//            }
//
//        }
//        System.out.println(list); //   [Java入门, Java进阶, Java实战, Java面试, 黑枸杞, 西洋参]
        // 解决方法2:倒序删除
        for (int i = list.size()-1; i >=0; i--) {
            String name = list.get(i);
            if(name.contains("枸杞")){
                list.remove(name);
            }
        }
        System.out.println(list);
        System.out.println("=================================");

        // 解决方法3:使用迭代器
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java入门");
        list2.add("Java进阶");
        list2.add("Java实战");
        list2.add("Java面试");
        list2.add("枸杞");
        list2.add("黑枸杞");
        list2.add("宁夏枸杞");
        list2.add("西洋参");
        System.out.println(list2);
        // 迭代器遍历并删除默认也会存在并发修改异常
        // 解决方案: 使用迭代器的remove()方法
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if(name.contains("枸杞")){
                iterator.remove();
            }
        }
        System.out.println(list2);
        System.out.println("=================================");
        // 错误解决方案:用增强for和lambda都不能解决并发修改异常
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java入门");
        list3.add("Java进阶");
        list3.add("Java实战");
        list3.add("Java面试");
        list3.add("枸杞");
        list3.add("黑枸杞");
        list3.add("宁夏枸杞");
        list3.add("西洋参");
        System.out.println(list3);
        // 增强for
//        for (String name : list3) {
//            if(name.contains("枸杞")){
//                list3.remove(name);
//            }
//        }
        // lambda
        list3.forEach(s -> {
            if(s.contains("枸杞")){
                list3.remove(s);
            }
        });
        System.out.println(list3);
        System.out.println("=================================");
        /**
         * 结论:增强for和lambda不能解决并发修改异常,只适合做遍历,不适合遍历并修改操作
         */
    }
}
