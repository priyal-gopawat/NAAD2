package com.streamliners.task0.TypeConversion;

import java.util.Scanner;


public class StringIntoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.valueOf(str);             //Integer.parseInt()
        System.out.println(a);




    }
}
