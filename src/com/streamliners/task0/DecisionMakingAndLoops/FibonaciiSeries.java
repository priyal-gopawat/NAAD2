package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class FibonaciiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of series \n");
        int n = sc.nextInt();
        int num = 0;
        int num1 = 1;
        for ( int i=1; i<=n; ++i)
        {
            System.out.println(num1+" ");
            int sum = num + num1;
            num = num1;
            num1 = sum;

        }
    }
}
