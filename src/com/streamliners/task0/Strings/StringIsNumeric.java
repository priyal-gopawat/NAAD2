package com.streamliners.task0.Strings;

import java.util.Scanner;

public class StringIsNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for( int i=0;i<str.length();i++)
        {
            if (str.charAt(i)<=48 || str.charAt(i)>=58)
            {
                System.out.println("string is not numeric");
                return;
            }
        }
        System.out.println("string is numeric");
    }
}
