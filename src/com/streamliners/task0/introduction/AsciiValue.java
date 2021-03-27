package com.streamliners.task0.introduction;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        System.out.println("enter a character");
        Scanner sc = new Scanner (System.in);
        char a = sc.next().charAt(0);
        int n = a;
        System.out.println(n);

    }
}
