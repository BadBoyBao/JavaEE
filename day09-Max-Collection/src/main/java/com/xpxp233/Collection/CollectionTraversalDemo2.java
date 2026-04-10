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
public class CollectionTraversalDemo {
    public static void main(String[] args) {
        // 目标:掌握Collection集合的遍历方式1:迭代器遍历
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("殷素素");
        System.out.println(list); //  [张无忌, 周芷若, 赵敏, 张强, 张三丰, 殷素素]
        //                             iterator
        // 1.得到这个集合的迭代器对象
        Iterator<String> iterator = list.iterator();
        // 2.使用一个while循环遍历集合
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }


    }
}
