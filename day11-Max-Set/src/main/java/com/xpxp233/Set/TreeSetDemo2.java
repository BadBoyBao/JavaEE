package com.xpxp233.Set;


import com.xpxp233.DTO.Teacher;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file TreeSetDemo2
 * @date 2026/04/11  14:15
 * @email thexpxp233@qq.com
 **/
public class TreeSetDemo2 {
    public static void main(String[] args) {
        // 搞清楚TreeSet集合对于自定义对象的排序
        Set<Teacher> set = new TreeSet<>(Comparator.comparingDouble(Teacher::getSalary)); // 排序,不重复,无索引
        set.add(new Teacher("张三", 18, 6232.4));
        set.add(new Teacher("老陈", 20, 3999.5));
        set.add(new Teacher("王五", 19, 4999.5));
        set.add(new Teacher("Li三", 18, 6232.4));
        System.out.println(set);

        // 结论:TreeSet集合默认不能给自定义对象排序,因为不知道大小规则
        // 一定要能解决怎么办?
        // 方案1:对象实现Comparable接口,重写compareTo方法,指定比较规则
        // 方案2:public TreeSet集合自带的Comparator接口,指定比较规则
    }
}
