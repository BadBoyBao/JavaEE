package com.IoDemo.BufferReaderStream;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file BufferWriterStreamDemo
 * @date 2026/04/14  14:13
 * @email thexpxp233@qq.com
 **/
public class BufferWriterStreamDemo {
    public static final String PATH = "day14-Max-Io/src/BufferWriter.txt";

    public static void main(String[] args) {
        // 目标:搞清楚缓冲字符输出流的使用,提升了字符输出流的写字符性能,多了换行的功能
        try (
                Writer fw = new FileWriter(PATH , true) ;
                // 创建缓冲字符输出流对象,包装低级字符输出流对象
                BufferedWriter bw = new BufferedWriter(fw) ;

        ) {
            bw.newLine();
            bw.write('a');
            bw.write(98);
            bw.write('沛');
            bw.newLine();

            // 3.写一个字符串出去,public void write(String str)
            bw.write("我爱Java,想找一段小厂实习");
            bw.write("JAVA");
            bw.newLine();

            // 3.1 写一个字符串一部分出去,public void write(String str, int off, int len)
            bw.write("JAVA" , 1 , 2);
            bw.newLine();

            // 4.写一个数组出去,public void write(char[] cbuf)
            char[] chars = "JAVA".toCharArray();
            bw.write(chars);
            bw.newLine();

            // 5.写一个数组一部分出去,public void write(char[] cbuf, int off, int len)
            bw.write(chars , 1 , 2);
        } catch (Exception e) {
        }
    }
}
