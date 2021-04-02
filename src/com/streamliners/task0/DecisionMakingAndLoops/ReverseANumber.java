package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int temp = a;
        int rev = 0;
        while(temp!=0)
        {
            rev=rev*10 + temp%10;
            temp/=10;
        }
        System.out.println("reverse "+rev );
    }
}
