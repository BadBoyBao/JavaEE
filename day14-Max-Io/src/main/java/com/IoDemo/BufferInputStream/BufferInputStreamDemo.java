package com.IoDemo.BufferInputStream;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file BufferInputStreamDemo
 * @date 2026/04/14  12:50
 * @email thexpxp233@qq.com
 **/
public class BufferInputStreamDemo {

    // 操作路径
    private static final String PATH = "E:/CodeStudy/resource";

    public static void main(String[] args) {
        // 目标:使用缓冲字节流的使用
        // 目标文件
        String FileName = PATH + "/证明.png";
        copyFile(FileName , PATH + "/aaa/newPic.png");

    }

    // 复制文件方法
    public static void copyFile(String srcPath , String destPath) {
        try (
                // 1.创建一个文件字节输入流通道与源文件接通
                InputStream fileInputStream = new FileInputStream(srcPath) ;
                // 把低级的字节流包装成高级的缓冲字节输入流
                InputStream bufferInputStream = new BufferedInputStream(fileInputStream) ;

                // 2.创建一个文件字节输出流通道与目标文件接通
                OutputStream fileOutputStream = new FileOutputStream(destPath) ;
                // 把低级的字节流包装成高级的缓冲字节输出流
                OutputStream bufferOutputStream = new BufferedOutputStream(fileOutputStream)

        ) {
            // 3.开始复制
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferInputStream.read(buffer)) != -1) {
                bufferOutputStream.write(buffer , 0 , len);
            }
    
            System.out.println("复制完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
