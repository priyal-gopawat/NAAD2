package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class CharacterIsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        int n = chr;
        if((n>=65 && n<=90) || (n>=97 && n<=122) )
            System.out.println("character is alphabet");
        else
            System.out.println("character is not alphabet1");


    }
}
