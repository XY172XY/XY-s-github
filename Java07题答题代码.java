package com.ISEKAI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class duqu {
    static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            int sum = 0;
            int jishu = 0;
            try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
                String shuru;
                while ((shuru = br.readLine())!= null) {
                    int number = Integer.parseInt(shuru);
                    jishu++;
                }
                if (jishu == 0) {
                    throw new EmptyFileException("文件为空");
                }
                double average = (double) sum / jishu;
                System.out.println("整数的平均值为：" + average);
            }
        } catch (FileNotFoundException e) {
            System.err.println("未找到文件");
        } catch (EmptyFileException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("格式错误");
        } catch (IOException e) {
            System.err.println("发生 I/O 异常");
        } finally {
            System.out.println("文件读取完场");
        }
    }
}