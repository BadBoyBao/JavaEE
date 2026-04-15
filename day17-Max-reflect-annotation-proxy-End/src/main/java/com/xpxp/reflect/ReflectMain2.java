package com.xpxp.reflect;


import com.xpxp.reflect.DTO.Student;
import com.xpxp.reflect.DTO.Teacher;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/15  17:18
 * @email thexpxp233@qq.com
 **/
public class ReflectMain2 {


    /**
     * 获取类信息
     */
    @Test
    public void getClassInfo() {
        // 目标:获取类的信息
        // 1.反射第一步:获取类对象
        Class c1 = Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
    }

    /**
     * 获取构造方法信息
     *
     * @throws Exception
     */
    @Test
    public void getConstructorInfo() throws Exception {
        // 目标:获取构造方法信息
        // 1.反射第一步:获取类对象
        Class c1 = Teacher.class;
        //  获取构造方法信息
        Constructor[] cons = c1.getDeclaredConstructors();
        for (Constructor c : cons) {
            System.out.println(c.getName() + "(" + c.getParameterCount() + ")");
        }

        // 获取单个构造器
        Constructor con = c1.getDeclaredConstructor();
        System.out.println(con.getName() + "(" + con.getParameterCount() + ")");

        // 获取某个构造器
        Constructor con2 = c1.getDeclaredConstructor(String.class , int.class);
        System.out.println(con2.getName() + "(" + con2.getParameterCount() + ")");


        // 获取构造器的作用依然是创建对象
        // 暴力反射:暴力反射可以访问private修饰的成员变量和方法
        con.setAccessible(true);
        Teacher t = (Teacher) con.newInstance();
        System.out.println(t);
    }

    /**
     * 获取类的对象成员变量信息并对其进行操作
     *
     */
    @Test
    public void getFieldInfo() throws Exception {
        // 目标:获取类的对象成员变量信息并对其进行操作
        // 1.反射第一步:获取类对象
        Class c1 = Teacher.class;
        // 2.获取成员变量信息
        Field[] fds = c1.getDeclaredFields();
        for (Field fd : fds) {
            System.out.println(fd.getName() + ":" + fd.getType());
        }
        // 3.获取单个成员变量信息
        Field fd = c1.getDeclaredField("address");
        System.out.println(fd.getName() + "(" + fd.getType() + ")");


        // 获取成员变量目的依然是取值赋值
        Teacher t = new Teacher("xpxp" , 22 , "");
        fd.setAccessible(true);
        fd.set(t , "广州");
        System.out.println(t);
    }

    /**
     * 获取类的对象成员方法信息并调用
     */
    @Test
    public void getMethodInfo() throws Exception {
        // 获取类的对象成员方法信息并调用
        // 反射第一步:获取类对象
        Class c1 = Teacher.class;
        // 获取成员方法信息
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        }

        // 获取单个成员方法对象
        Method method = c1.getDeclaredMethod("show");
        Method method2 = c1.getDeclaredMethod("show" , String.class);
        System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        System.out.println(method2.getName() + "(" + method2.getParameterCount() + ")");


        // 获取成员方法对象目的依然是调用方法
        Teacher t = new Teacher("xpxp" , 22 , "111");
        method.invoke(t);


        method2.setAccessible(true);
        method2.invoke(t , "xpxp");
        System.out.println(t);

    }
}
