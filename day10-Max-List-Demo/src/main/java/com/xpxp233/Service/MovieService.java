package com.xpxp233.Service;


import com.xpxp233.DTO.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MovieService
 * @date 2026/04/08  21:29
 **/
public class MovieService {

    // 4.准备一个集合容器,存储全部上架的电影数据
    private static final List<Movie> movies = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            // 3.准备操作界面
            System.out.println("欢迎来到电影管理系统");
            System.out.println("1. 上架电影");
            System.out.println("2. 下架某个电影");
            System.out.println("3. 查询某个电影");
            System.out.println("4. 封杀某个明星");
            System.out.println("5. 退出");
            System.out.println("6. 展示全部电影");
            System.out.println("7. 修改某个电影");
            System.out.println("请输入操作命令");
            String command = sc.next();
            switch (command) {
                case "1":
                    // 上架电影
                    addMovie();
                    break;
                case "2":
                  //   下架电影(自己做)
                    removeMovie();
                    break;
                case "3":
                    // 查询电影
                    queryMovie();
                    break;
                case "4":
                   // 封杀明星
                    removeStart();
                    break;
                case "5":
                    System.out.println("退出");
                    return;
                case "6":
                    // 展示全部电影
                    queryAllMovies();
                    break;
                case "7":
                   //  修改电影(自己做)
                    updateMovie();
                default:
                    System.out.println("输入有误");
            }
        }


    }

    /**
     * 修改电影
     */
    private void updateMovie() {
        System.out.println("==========修改电影============");
        System.out.println("请输入电影名称");
        String name = sc.next();
        Movie movie = queryMovie(name);
        if (movie != null){
            System.out.println("请输入新的电影名称");
            movie.setName(sc.next());
            System.out.println("请输入新的电影价格");
            movie.setPrice(sc.nextDouble());
            System.out.println("请输入新的电影主演");
            movie.setActor(sc.next());
            System.out.println("请输入新的电影评分");
            movie.setScore(sc.nextDouble());
            System.out.println("修改成功");
        }
    }

    /**
     * 删除电影
     */
    private void removeMovie() {
        System.out.println("==========下架电影============");
        System.out.println("请输入电影名称");
        String name = sc.next();
        Movie movie = queryMovie(name);
        if (movie != null){
            movies.remove(movie);
            System.out.println("删除成功");
        }else{
            System.out.println("没有找到该电影");
        }
    }

    /**
     * 展示全部电影
     */
    private void queryAllMovies() {
        System.out.println("==========展示全部电影============");

        for (Movie movie : movies) {
            System.out.println(movie);
        }

    }

    /**
     * 封杀明星
     */
    private void removeStart() {
        System.out.println("==========封杀明星============");
        System.out.println("请输入明星名称");
        String name = sc.next();
        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.getActor().contains(name)){
                iterator.remove();
                System.out.println("封杀成功");

            }
        }
        queryAllMovies();
    }

    /**
     * 查询电影
     */
    private void queryMovie() {

        System.out.println("==========查询电影============");
        System.out.println("请输入电影名称");
        String name = sc.next();
        // 根据电影名称查询电影对象返回,展示这个对象数据
        Movie movie = queryMovie(name);
        if (movie != null){
            System.out.println(movie);
        }else{
            System.out.println("没有找到该电影");
        }
    }

    // 根据电影名称查询对象返回
    private Movie queryMovie(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null; // 代表没有找到这个电影对象
    }

    /**
     * 添加电影
     */
    private void addMovie() {
        System.out.println("==========上架电影============");
        // 分析:每点击一次上架电影,创建一个电影对象,并把电影数据录入到电影对象中
        // 1.创建电影对象,封装电影信息
        Movie movie = new Movie();
        // 2.给电影对象赋值
        System.out.println("请输入电影名称");
        movie.setName(sc.next());
        System.out.println("请输入电影价格");
        movie.setPrice(sc.nextDouble());
        System.out.println("请输入电影主演");
        movie.setActor(sc.next());
        System.out.println("请输入电影评分");
        movie.setScore(sc.nextDouble());
        // 3.把电影对象添加到集合中
        movies.add(movie);
        System.out.println("添加成功");

    }
}
