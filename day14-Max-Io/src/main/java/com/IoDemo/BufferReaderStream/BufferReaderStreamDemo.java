package com.IoDemo.BufferReaderStream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file BufferReaderStreamDemo
 * @date 2026/04/14  13:49
 * @email thexpxp233@qq.com
 **/
public class BufferReaderStreamDemo {

    public static final String PATH = "day14-Max-Io/src/text2.txt";

    public static void main(String[] args) {
        // 目标:搞清楚缓冲字符输入流读取字符内容,性能提升了,多了按照行读取文本的能力

        try (
                Reader reader = new FileReader(PATH) ;
                // 创建缓冲字符输入流包装低级的字符输入流
                BufferedReader bufferReader = new BufferedReader(reader) ;

        ) {

//            char[] chars = new char[1024];
//            int len;
//            while ((len = reader.read(chars)) != -1) {
//                System.out.print(new String(chars , 0 , len));
//            }
            System.out.println(bufferReader.readLine());
            System.out.println(bufferReader.readLine());
            System.out.println(bufferReader.readLine());
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
