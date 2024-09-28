package com.ISEKAI;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class netcode {


    {
        try {
            Socket thesocket = new Socket("111.111.111.111", 7006);
            //构造方法（客户端）
            ServerSocket SS = new ServerSocket(7006);
            Socket clientsocket = SS.accept();
            //构造方法（服务器端）
            OutputStream OSC=thesocket.getOutputStream();
            InputStream ISC=thesocket.getInputStream();
            OSC.write("服务器服务器我是客户端！".getBytes());
            byte[] buffer=new byte[1024];
            int bytesread =ISC.read(buffer);//read(buffer)会返回读取到的读取的字节数量
            String comment= new String(buffer,0, bytesread);
            System.out.println("已收到服务器信息"+comment);
            //读取与输出信息


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}