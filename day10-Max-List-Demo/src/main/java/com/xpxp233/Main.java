package com.xpxp233;


import com.xpxp233.Service.MovieService;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/08  21:23
 **/
public class Main {
    public static void main(String[] args) {
        // 目标:完成电影案例
        // 1.创建电影对象,定义电影类
        // 2.创建一个电影操作对象,专门负责电影的CRUD(上架,下架,查询,封杀某个电影明星的电影)
        MovieService movieService = new MovieService();
        movieService.start();
        //
    }
}
