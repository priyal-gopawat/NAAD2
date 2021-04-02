package com.streamliners.task0.Arrays;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        double a[] = new double[n];
        System.out.print("Enter elements of array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        double sum =0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        double avg = sum/n;
        System.out.println("average : "+avg );
    }
}
