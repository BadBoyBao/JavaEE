package com.xpxp233.pojo;


import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MyArrayList
 * @date 2026/04/07  17:30
 **/
public class MyArrayList <E>{
    private ArrayList list = new ArrayList();
    public boolean add(E e){
        list.add(e);
        return true;
    }
    public boolean remove(E e){
        return list.remove(e);
    }
    public String toString(){
        return list.toString();
    }

}
