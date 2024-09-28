package com.ISEKAI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;
import java.util.SplittableRandom;

public class website {

    {
        try {
            ServerSocketChannel SSC = ServerSocketChannel.open();
            SSC.bind(new InetSocketAddress(8888));
            //服务器
            SocketChannel SC=SocketChannel.open();
            SC.connect(new InetSocketAddress("",8899));
            //客户端
            //如果服务器发现有客户端连接
            SocketChannel chanel1=SSC.accept();
            //客户端的输入输出
            if(SC.finishConnect()){
            System.out.println("连接服务器成功");
        }else{
        System.out.println("正在连接服务器");
    }
        String message;
        ByteBuffer BB = null;
        BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
        message=BR.readLine();
            BB.wrap(message.getBytes());
            while(BB.hasRemaining()){
                SC.write(BB);
            }
            System.out.println("等待服务器响应");
            BB.clear();

            int byteread;
            while((byteread=SC.read(BB))!=-1){
                BB.flip();
                byte[] bytes=new byte[BB.remaining()];
                BB.get(bytes);
                String response=new String(bytes);
                System.out.println("已收到服务器回复："+response);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
