package com.streamliners.task0.introduction;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        int d = a%b;
        System.out.println("quotient is : "+c +" "+ "remainder is : " +d);
    }
}
