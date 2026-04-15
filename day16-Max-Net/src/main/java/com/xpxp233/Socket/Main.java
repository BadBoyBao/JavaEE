package com.xpxp233.Socket;


import com.xpxp233.Socket.Server.ServerReader;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/15  15:57
 * @email thexpxp233@qq.com
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        // 目标:BS架构的原理了解
        System.out.println("服务启动了");
        ServerSocket ss = new ServerSocket(8080);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3 , 10 , 10 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(100) , Executors.defaultThreadFactory() , new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            Socket accept = ss.accept();
            System.out.println("一个客户端上线了:" + accept.getInetAddress().getHostAddress());
            // 把这个客户端管道包装成一个任务交给线程池处理
            poolExecutor.execute(new ServerReader(accept));
        }
    }
}
