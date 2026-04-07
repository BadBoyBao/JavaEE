package com.xpxp233.GenericityDemo.Service;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Data
 * @date 2026/04/07  17:49
 **/
public interface Data <T>{
    void add(T t);
    void remove(T t);
    void update(T t);
    T query(int id);
}
