package com.ISEKAI.tool;
public class forwhile {
    public static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>n/2+1){
                    //前半段和后半段的判断是不一样的，这里做区分
                    if((j==i-n/2)||(j==n+n/2-i+1)) {
                       // 后半段的i与“*”下标的判断式
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else {
                    if((j==n/2+2-i)||(j==n/2+i)) {
                        //前半段i与下标的判断式
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
    //-------------------------------------------------------------//
    public static boolean ifelse(int year){
        if(year<=0){
            System.out.println("公元前不考虑啦(*^_^*)");
            return false;
        }

    else if(year%4!=0){
        return false;
        }
    else{
        return true;
        }
    }
    public static void main(String[] args) {
        forwhile.print(9);
        System.out.println(ifelse(2024));
    }
}
