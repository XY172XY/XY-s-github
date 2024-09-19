package com.ISEKAI.tool;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a;
        args=new String[100];
        for (int i = 1; i <= 3; i++) {
            args[i]=scanner.next();
            a=args[i];
            System.out.println(a);
        }
    }

    public static void print(String args){
        System.out.println(args);
    }
}
