package com.xpxp233;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 目标:完成Map集合相关案例:投票统计程序
        /**
         * 需求
         * 某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是（A、B、C、D）,每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
         */
        calc();
    }

    public static void calc() {
        // 1.把80个学生选择的景点数据拿到,才可以统计.
        List<String> locations = new ArrayList<>();
        String[] names = { "玉龙雪山" , "长城" , "少林寺" , "西风山" , "丽江" };
        Random r = new Random();
        for (int i = 1 ; i <= 80 ; i++) {
            int index = r.nextInt(names.length);
            locations.add(names[index]);
        }
        System.out.println(locations);
        // locations: [玉龙雪山, 长城, 少林寺, 少林寺, 少林寺, 少林寺, 少林寺, 少林寺, 少林寺, 少林寺,....]


        // 2.统计每个景点被选择的次数
        // 最终统计的结果是一个键值对的形式,所有可以考虑定义一个Map集合统计结果
        Map<String, Integer> map = new HashMap<>();
        // 3.遍历80个学生选择的景点,来统计选择的次数
        for (String location : locations) {
            // 4.判断当前景点是否已经存在map集合中,如果存在,则次数+1,如果不存在,则添加到map集合中,次数为1
//            if(map.containsKey(location)){
//                // 这个景点已经存在,次数+1
//                map.put(location,map.get(location) + 1);
//            }else{
//                // 这个景点是第一次统计,存入"景点 = 1"
//                map.put(location,1);
//            }
            // 简化写法,
            map.put(location , map.containsKey(location) ? map.get(location) + 1 : 1);
        }
        // 5.把统计结果遍历出来
        map.forEach((k , v) -> System.out.println(k + " = " + v));

    }
}