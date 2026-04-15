package com.xpxp233.Socket.Server;


import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ServerReader
 * @date 2026/04/15  16:02
 * @email thexpxp233@qq.com
 **/
public class ServerReader extends Thread {
    private Socket socket;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 给当前对应的浏览器管道响应一个网页数据回去
            OutputStream outputStream = socket.getOutputStream();
            // 通过字节输出流包装写出去数据给浏览器
            // 把字节输出流转换成打印流
            PrintStream ps = new PrintStream(outputStream);
            // 写响应数据
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<title>");
            ps.println("欢迎来到Max的博客");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1>欢迎来到Max的博客</h1>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("客户端下线了:" + socket.getInetAddress().getHostAddress());
        }
    }
}
