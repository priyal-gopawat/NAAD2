package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;
        while(n!=0)
        {
        n/=10;
        count++;
            System.out.println("number of digits "+count);


        }

    }
}
