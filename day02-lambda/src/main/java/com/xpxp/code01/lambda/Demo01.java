package com.xpxp.code01.lambda;


@FunctionalInterface
interface swim {
    void swimming();
}

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Demo01
 * @date 2026/03/17  10:31
 **/
public class Demo01 {

    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void say() {

                System.out.println("嘎嘎嘎==============");
            }
        };
        animal.say();

        swim swim = ()->{
            System.out.println("我不会游泳");
        };

    }
}

abstract class Animal {
    public abstract void say();
}

