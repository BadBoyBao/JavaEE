package com.xpxp.test2;


import com.xpxp.test2.DTO.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/16  12:56
 * @email thexpxp233@qq.com
 **/
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        // 100个人,编号是[1-200]随机整数,不能重复,位置从1开始
        // Person 对象:编号,位置
        for (int i = 1 ; i <= 100 ; i++) {
            int code = (int) (Math.random() * 200 + 1);
            // 需求:要检查编号是否重复,如果不重复,则添加,写一个方法
            if (checkNum(personList , code)) {
                i--;
                continue;
            }
            personList.add(new Person(code , i));

        }
        System.out.println(personList);
        // 淘汰奇数的位置,然后没淘汰的人,又要从按位置1开始,继续淘汰奇数位的人,依次类推,直到剩下一个人为止 (写一个方法)
        while (true) {
            List<Person> lastPerson = new ArrayList<>();
            for (int i = 1 ; i < personList.size() ; i += 2) {
                Person person = personList.get(i);
                lastPerson.add(person);
            }
            if (lastPerson.size() == 1) {
                System.out.println(lastPerson);
                break;
            }
            personList = lastPerson;
        }
    }


    private static boolean checkNum(List<Person> personList , int i) {
        for (Person person : personList) {
            if (person.getI() == i) {
                return true;
            }
        }
        return false;
    }
}
