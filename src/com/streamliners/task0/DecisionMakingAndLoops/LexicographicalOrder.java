package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of words");
        int n = sc.nextInt();
        System.out.println("enter all words");
        String[] words = new String[n + 1];
        for (int i = 0; i < n + 1; i++) {
            words[i] = sc.nextLine();
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp;
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Lexicographical Order");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");

        }

    }
}
