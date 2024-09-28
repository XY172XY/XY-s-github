package com.ISEKAI;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class fuwuqi {
    public static class SimpleChatServer {
        private final List<PrintWriter> clientWriters = new ArrayList<>();

        public void go() {
            //将服务器运行起来
            try {
                ServerSocket SSC = new ServerSocket(8888);
                System.out.println("服务器已启动，等待客户端连接");
                while(true) {
                    Socket SC;
                    SC = SSC.accept();
                    System.out.println("客户端连接成功");
                    PrintWriter writer=new PrintWriter(SC.getOutputStream());
                    clientWriters.add(writer);

                    Thread L=new Thread(new ClientHandler(SC));
                    L.start();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        private void tellEveryone(String message) {
               for(PrintWriter a:clientWriters){
                   a.println(message);
                   System.out.println("收到客户端信息"+message+"已转发给所有用户");
                   a.flush();//确保马上被输出到client的输出台，属于优化了
               }
            //将消息打印出来
        }

        public class ClientHandler implements Runnable {
            private final Socket CS;
            //定义一个控制类
            ClientHandler(Socket a){
                CS=a;
            }
            @Override
            public void run() {
                try {
                    /*这一段是未做附加题前的代码
                    BufferedReader reader=new BufferedReader(new InputStreamReader(CS.getInputStream()));
                    String message;
                    while((message=reader.readLine())!=null){
                        tellEveryone(message);
                       }
                     */
                    BufferedReader reader=new BufferedReader(new InputStreamReader(CS.getInputStream()));
                    String comment;
                    while((comment=reader.readLine())!=null) {
                        tellEveryone(comment);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //运行函数
            }
        }
    }

    public static void main(String[] args) {
        new SimpleChatServer().go();
    }
}
