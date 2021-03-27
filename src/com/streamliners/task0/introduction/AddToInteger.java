package com.streamliners.task0.introduction;

import java.util.Scanner;

public class AddToInteger {
    public static void main(String[] args) {
        System.out.println("enter two integers");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("the sum is :"+c);
    }

}
