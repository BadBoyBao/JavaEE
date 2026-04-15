package com.xpxp.reflect;


import com.xpxp.reflect.DTO.Dog;
import com.xpxp.reflect.DTO.Student;
import com.xpxp.reflect.DTO.Teacher;
import com.xpxp.reflect.FrameWork.SaveObjectFrameWork;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file DemoMain
 * @date 2026/04/15  20:29
 * @email thexpxp233@qq.com
 **/
public class DemoMain {
    public static void main(String[] args) throws Exception {
        // 目标:实现一个小案例,做框架的通用技术
        Dog dog = new Dog("小黑" , 3);
        SaveObjectFrameWork.saveObject(dog);

        Teacher teacher = new Teacher("小磊" , 22 , "Java,,前端,后端");
        SaveObjectFrameWork.saveObject(teacher);

        Student student = new Student("小杰" , 18 , "爱问问题");
        SaveObjectFrameWork.saveObject(student);
    }
}
