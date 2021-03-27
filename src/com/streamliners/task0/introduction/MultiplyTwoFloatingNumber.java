package com.streamliners.task0.introduction;

import java.util.Scanner;

public class MultiplyTwoFloatingNumber {
    public static void main(String[] args) {
        System.out.println("enter two number :");
        Scanner sc = new Scanner (System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
         float c = a*b;
        System.out.println("multiplication is :"+c);

    }
}
