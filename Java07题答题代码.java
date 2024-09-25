package com.ISEKAI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class duqu {
    package com.ISEKAI.tool;

import com.ISEKAI.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class teseone {
        static class EmptyFileException extends Exception {
            public EmptyFileException(String message) {
                super(message);
            }
        }

        public static void main(String[] args) {
            try {
                int sum = 0;
                int jishu = 0;
                BufferedReader a = new BufferedReader(new FileReader("data.txt"));//FileReader 又忘记打new 卡了半天，下次我一定new一个对象给自己
                String shuru;
                while ((shuru = a.readLine()) != null) {//按习惯我会写shuru=a.readLine()&&shur!=null;但时会报错，所以去查了一种功能一样的写法
                    int number = Integer.parseInt(shuru);
                    sum += number;//检查的时候发现没有加sum，罪过罪过
                    //嗯，这是前文提到的Integer拆盒为int，也可以拆盒为string
                    jishu++;
                }
                if (jishu == 0) {
                    throw new test.EmptyFileException("文件为空");
                }
                double average = (double) sum / jishu;
                System.out.println("平均值为：" + average);

            } catch (FileNotFoundException e) {
                System.err.println("未找到文件");
            } catch (test.EmptyFileException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("格式错误");
            } catch (IOException e) {
                System.err.println("发生输入输出异常");
            } finally {
                System.out.println("文件读取完场");
            }

        }
    }

}