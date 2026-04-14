package com.xpxp233;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 目标:认识Map家族,体系特点

        // 1.创建Map集合
        // HashMap特点,无序,不重复,无索引,键值对都可以是null,值不做要求(可以重复)
        // LinkedMap特点:有序,不重复,无索引,键值对都可以是null,值不做要求(可以重复)
        // TreeMap特点:有序,不重复,无索引


        // Map<String, Integer> map = new HashMap<>();// 经典代码
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 28);
        map.put(null,null);
//        System.out.println(map);


        Set<String> strings = map.keySet();
        System.out.println(strings);
        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println(map.put("嫦娥", 28));
        System.out.println(map.size());
        System.out.println(map.get("女儿国王"));
        System.out.println(map.containsKey("紫霞"));
        System.out.println(map.containsKey("孙悟空"));
        System.out.println(map.containsValue(28));
        System.out.println(map.containsValue(381));

        System.out.println(map.remove("嫦娥"));
        System.out.println(map);

        System.out.println(map.isEmpty());




    }
}