package com.xpxp233.DTO;


import java.util.Objects;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Student
 * @date 2026/04/11  11:19
 * @email thexpxp233@qq.com
 **/

public class Student {
    private String name;
    private int age;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(String name , int age , String address , String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address='" + address + '\'' + ", phone='" + phone + '\'' + '}' + "\n";
    }


    // 只要两个对象的内容一样,就返回true
    @Override
    public boolean equals(Object o) {
        // 1.如果自己和自己比较,就直接返回true
        if (this == o) return true;
        // 2.如果o为null或者o的对象类型和自己不一样,就返回false
        if (o == null ||  this.getClass() != o.getClass()) return false;
        // 3.比较两个对象的内容是否一样
        Student student = (Student) o;

        return this.age == student.age && name.equals(student.name) && address.equals(student.address) && phone.equals(student.phone);
    }

    @Override
    public int hashCode() {
        // 包装了不同的学生对象,如果内容一样返回的哈希值一定是一样的
        return Objects.hash(name, age, address, phone);
    }

}
