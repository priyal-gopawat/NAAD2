package com.streamliners.task0.introduction;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char chr = sc.next().charAt(0);
        int count = 0;
        for (int i = 0;i<str.length();i++)
        {
            if (str.charAt(i)==chr) count++;

        }
        System.out.println("frequency of "+chr+" is : "+count);
    }
}
