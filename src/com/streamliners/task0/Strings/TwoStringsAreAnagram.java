package com.streamliners.task0.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringsAreAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2))
        {
            System.out.println("strings are anagram");
        }
        else
            System.out.println("strings are not anagram");
    }
    
}
