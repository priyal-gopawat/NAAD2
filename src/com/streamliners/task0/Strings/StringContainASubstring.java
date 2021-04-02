package com.streamliners.task0.Strings;

import java.util.Scanner;

public class StringContainASubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.contains(str2)) System.out.println("str1 contains str2");
        if (str2.contains(str1)) System.out.println("str2 contains str1");
    }
}
