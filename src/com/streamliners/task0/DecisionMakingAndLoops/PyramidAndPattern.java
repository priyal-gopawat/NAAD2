package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class PyramidAndPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 5;
        for(int i=0;i<5;i++)
        {
            for (int space=1;space<=rows-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
