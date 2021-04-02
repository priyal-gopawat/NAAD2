package com.streamliners.task0.Strings;

import java.util.Scanner;

public class StringsOperatorAndEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two strings :");
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        if (str.equals(str1))
        {
            System.out.println("equals method used ");
        }
        if (str==str)
        {
            System.out.println("equal operator used ");
        }
    }
}
