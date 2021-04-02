package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class DisplayAlphabetsAToZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        for(int i=0;i<26;i++)
        {
            System.out.println(ch +" ");
            ch++;
        }

    }
}
