package com.xpxp.test1;


import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file main
 * @date 2026/04/16  12:18
 * @email thexpxp233@qq.com
 **/
public class main {
    public static void main(String[] args) {
        // red:[1-35],blue:[1-15]
        // red有6个随机不重复,升序排序输出
        // blue有1个
        Set<Integer> red = new TreeSet<>();
        while (red.size() < 6) {
            int redNum = (int) (Math.random() * 35 + 1);
            red.add(redNum);
        }
        System.out.println("红球:" + red);

        int blue = (int) (Math.random() * 15 + 1);
        System.out.println("蓝球:" + blue);
        red.add(blue);

        // 用户号码：red:10,12,30,16,7,17,blue:12
        Set<Integer> luckRed = new TreeSet<>();
        Collections.addAll(luckRed , 10 , 12 , 30 , 16 , 7 , 17);
        int luckBlue = 12;
        int redCount = 0;
        for (Integer i : red) {
            if (luckRed.contains(i)) {
                redCount++;
            }
        }
        System.out.println("用户命中了红球:" + redCount + ",篮球命中了" + (blue == luckBlue ? 1 : 0));

    }
}
