package com.ISEKAI;
import java.io.*;
import java.net.*;

public class netcode {
    public static class SimpleChatClientA {
        Socket SC;
        PrintWriter writer;
        static BufferedReader reader;

        public void go() {
            try {
                SC = new Socket("192.168.2.6", 8888);
                writer = new PrintWriter(SC.getOutputStream());
                reader = new BufferedReader(new InputStreamReader(SC.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
                // call the setUpNetworking() method
            }
        }

        private void setUpNetworking() {
            System.out.println("客户端准备完毕！！");
        }

        public void sendMessage() {
            try {
                BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
                String message;
                while ((message=BR.readLine())!=null) {
                    writer.println(message);
                    writer.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static class jieshou implements Runnable {
            @Override
            public void run() {
                try {
                    String get;
                    while ((get = reader.readLine()) != null) {
                        System.out.println("接收到服务器信息：" + get);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
        public static void main(String[] args) {
            SimpleChatClientA A = new SimpleChatClientA();
            A.go();
            A.setUpNetworking();
            Thread L = new Thread(new SimpleChatClientA.jieshou());
            L.start();
            A.sendMessage();
        }

}