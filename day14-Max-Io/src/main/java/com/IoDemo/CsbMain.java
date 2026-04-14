package com.IoDemo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CsbMain
 * @date 2026/04/14  14:28
 * @email thexpxp233@qq.com
 **/
public class CsbMain {
    public static final String PATH = "day14-Max-Io/src/csb.txt";

    public static void main(String[] args) {
        // 目标:完成出师表的案例

        try (
                // 1.创建一个字符缓冲输入流对象与源文件接通
                BufferedReader br = new BufferedReader(new FileReader(PATH)) ;
                // 6.
                BufferedWriter bw = new BufferedWriter(new FileWriter("day14-Max-Io/src/csb_new.txt")) ;
        ) {
            // 2.提前准备一个List集合存储每段内容
            List<String> data = new ArrayList<>();
            // 3.按行读取数据,存入data中
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            Collections.sort(data);
            System.out.println(data);

            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }

            System.out.println("处理完毕");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
