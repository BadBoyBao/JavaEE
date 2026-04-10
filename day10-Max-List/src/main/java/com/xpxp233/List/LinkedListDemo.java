package com.xpxp233.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file LinkedListDemo
 * @date 2026/04/08  18:01
 **/
public class LinkedListDemo {

    public static void main(String[] args) {
        // 目标:掌握LinkedList集合的常用方法
        // 用LinkedList做一个队列对象
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addFirst("赵敏");
        queue.addFirst("周芷若");
        queue.addFirst("陆小凤");
        queue.addFirst("西门吹雪");
        System.out.println("初始:"+queue);

        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("=======================================");
        // 用LinkedList做一个栈对象
        LinkedList<String> stack = new LinkedList<>();
        // 入栈
        stack.push("第一课子弹");
        stack.push("第二课子弹");
        stack.push("第三课子弹");
        stack.push("第四课子弹");
        System.out.println("初始:"+stack);
        // 出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
