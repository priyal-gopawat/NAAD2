package com.streamliners.task0.TypeConversion;

import java.util.Scanner;

public class IntIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = String.valueOf(a);             //Integer.tostring();
        System.out.println(str);

    }
}
