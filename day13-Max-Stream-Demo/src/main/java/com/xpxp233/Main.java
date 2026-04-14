package com.xpxp233;

import com.xpxp233.DTO.Room;

public class Main {
    public static void main(String[] args) {
        // 开发一个小案例：斗地主
        // 1，每张牌都是一个对象,定义一个牌类
        // 2.游戏房间也是一个对象,定义一个游戏房间类(54张牌,启动啊,)

        Room room = new Room();
        room.start();
    }
}