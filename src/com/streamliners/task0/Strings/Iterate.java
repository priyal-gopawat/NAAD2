package com.streamliners.task0.Strings;

import java.util.Scanner;

public class Iterate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i) + ",");
        }
    }
}
