package com.xpxp233.innerClass;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Outer
 * @date 2026/03/16  21:08
 **/
public class Outer {
    public class Inner {
        private String name;


        public Inner() {

        }
        public Inner(String name) {
            this.name = name;
        }

        public void show (){
            System.out.println("show");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
