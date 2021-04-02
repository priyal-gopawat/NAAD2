package com.streamliners.task0.Strings;

import java.util.Scanner;

public class CreateRandomStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789");
    StringBuilder sb = new StringBuilder();
        System.out.println("enter length of random string");
        int length = sc.nextInt();
        for (int i=0;i<length;i++)
        {
            int index  = (int)(str.length()*Math.random());
            sb.append(index);
        }
        System.out.println(sb);
    }

}
