package com.xpxp233.methodRerence;


import com.xpxp233.po.Car;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Demo4
 * @date 2026/04/02  12:18
 **/
public class Demo4 {
    public static void main(String[] args) {

        // 目标:理解构造器的引用
//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return new Car( name);
//            }
//        };
//        CarFactory cf = name -> new Car(name);
        CarFactory cf = Car::new;

    }
}
