package com.streamliners.task0.introduction;

import java.util.Scanner;

public class PrintAnInteger {
    public static void main(String[] args) {
        System.out.println("enter an integer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the number is : "+n);
    }
}
