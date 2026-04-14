package com.IoDemo;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Demo
 * @date 2026/04/14  14:39
 * @email thexpxp233@qq.com
 **/
public class Demo {
    public static final String SRC_FILE = "E:/CodeStudy/resource/video.mp4";
    public static final String DEST_FILE = "E:/CodeStudy/resource/aaa/";

    public static void main(String[] args) {
        // 目标:缓冲流,低级流的性能分析
        // /使用低级的字节流按照一个一个字节的形式复制文件。 :非常的慢,简直让人无法忍受,直接淘汰,禁止使用!
//        copyFile();
        //  使用低级的字节流按照字节数组的形式复制文件。 :是比较慢的,还可以接收
        copyFile2();
        //  使用高级的缓冲字节流按照一个一个字节的形式复制文件: 虽然是高级管道,但一个一个字节的复制还是太慢了,无法忍受,直接淘汰!
        // copyFile3();
        //  使用高级的缓冲字节流按照字节数组的形式复制文件: 非常快!推荐使用
        copyFile4();

    }

    // /使用低级的字节流按照一个一个字节的形式复制文件。
    public static void copyFile() {
        // 拿系统当前时间
        long start = System.currentTimeMillis(); // 此刻时间毫秒值
        try (InputStream inputStream = new FileInputStream(SRC_FILE) ; OutputStream outputStream = new FileOutputStream(DEST_FILE + "newVidemo1.mp4")) {
            int len;
            while ((len = inputStream.read()) != -1) {
                outputStream.write(len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  拿系统当前时间
        long end = System.currentTimeMillis();
        System.out.println("低级的字节流按照一个一个字节的形式复制文件,耗时:" + (end - start) / 1000.0 + "s");
    }

    // 使用低级的字节流按照字节数组的形式复制文件。
    public static void copyFile2() {
        long start = System.currentTimeMillis();
        try (InputStream inputStream = new FileInputStream(SRC_FILE) ; OutputStream outputStream = new FileOutputStream(DEST_FILE + "newVideo2.mp4")) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer , 0 , len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级的字节流按照字节数组的形式复制文件,耗时:" + (end - start) / 1000.0 + "s");
    }

    // 使用高级的缓冲字节流按照一个一个字节的形式复制文件
    public static void copyFile3() {
        long start = System.currentTimeMillis();
        try (InputStream inputStream = new FileInputStream(SRC_FILE) ; BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream) ; OutputStream outputStream = new FileOutputStream(DEST_FILE + "newVideo3.mp4") ; BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)

        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer , 0 , len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照一个一个字节的形式复制文件,耗时:" + (end - start) / 1000.0 + "s");
    }

    // 使用高级的缓冲字节流按照字节数组的形式复制文件。
    public static void copyFile4() {
        long start = System.currentTimeMillis();
        try (InputStream inputStream = new FileInputStream(SRC_FILE) ; BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream) ; OutputStream outputStream = new FileOutputStream(DEST_FILE + "newVideo4.mp4") ; BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer , 0 , len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("高级的缓冲字节流按照字节数组的形式复制文件,耗时:" + (end - start) / 1000.0 + "s");
    }
}
