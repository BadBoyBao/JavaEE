package com.xpxp.test3;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/16  14:46
 * @email thexpxp233@qq.com
 **/
public class Main {

    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#10002," +
                "赵敏,女,2023-07-22 09:11:21,黄鹤楼-归元禅寺#10003," +
                "周芷若,女,2023-07-22 04:11:21,木兰文化区-东湖#10004," +
                "小昭,女,2023-07-22 08:11:21,东湖#10005," +
                "灭绝,女,2023-07-22 17:11:21,归元禅寺";
        List<Student> studentList = parseStudent(info);
        Map<String, Integer> address = new HashMap<>();
        for (Student student : studentList) {
            System.out.println(student);
            String[] split = student.getAddress().split("-");
            for (String s : split) {
                if (address.containsKey(s)) {
                    address.put(s , address.get(s) + 1);
                } else {
                    address.put(s , 1);
                }
            }
        }
        System.out.println(address);


    }

    private static List<Student> parseStudent(String info) {
        List<Student> studentList = new ArrayList<>();
        String[] split = info.split("#");
        for (String s : split) {
            String[] split1 = s.split(",");
            Student student = new Student();
            student.setId(Integer.valueOf(split1[0]));
            student.setName(split1[1]);
            student.setSex(split1[2]);
            student.setBirthday(LocalDateTime.parse(split1[3] , dtf));
            student.setAddress(split1[4]);
            studentList.add(student);
        }
        return studentList;
    }
}
