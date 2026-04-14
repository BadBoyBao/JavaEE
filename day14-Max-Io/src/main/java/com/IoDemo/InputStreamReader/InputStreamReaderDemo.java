package com.IoDemo.InputStreamReader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file InputStreamReaderDemo
 * @date 2026/04/14  15:11
 * @email thexpxp233@qq.com
 **/
public class InputStreamReaderDemo {

    public static final String PATH = "day14-Max-Io/src/text3.txt";

    public static void main(String[] args) {
        // 目标: 演示一个问题,不同编码读取乱码的问题
        // 代码: UTF-8  文件 UTF-8 不乱码
        // 代码: UTF-8  文件 GBK 乱码
        try (
                Reader reader = new FileReader(PATH) ;
                // 创建缓冲字符输入流包装低级的字符输入流
                BufferedReader bufferReader = new BufferedReader(reader)

        ) {
            // 循环改造:
            String line;
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }
            // 目前获取文本性能最优雅的方案,性能好,不乱码,可以按照行读取
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
