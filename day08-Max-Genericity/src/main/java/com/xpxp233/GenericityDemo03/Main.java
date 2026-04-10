package com.xpxp233.GenericityDemo03;


import com.xpxp233.GenericityDemo03.DTO.BYD;
import com.xpxp233.GenericityDemo03.DTO.Car;
import com.xpxp233.GenericityDemo03.DTO.XiaoMi;

import java.util.ArrayList;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/07  18:32
 **/
public class Main {
    public static void main(String[] args) {
        // 目标:理解泛型的通配符

        ArrayList<XiaoMi> xiaomis = new ArrayList<>();

        xiaomis.add(new XiaoMi());
        xiaomis.add(new XiaoMi());
        xiaomis.add(new XiaoMi());
        xiaomis.add(new XiaoMi());
        xiaomis.add(new XiaoMi());
        go(xiaomis);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);


    }
    public static void go(ArrayList<? extends Car> cars){

    }
}
