package com.xpxp233;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file GirlFriend
 * @date 2026/03/01  23:52
 **/

public class GirlFriend {

    private String name;
    private int age;
    private String gender;

    public GirlFriend(){

    }
    public GirlFriend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("请输入正确年龄");
        }else  {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }


}
