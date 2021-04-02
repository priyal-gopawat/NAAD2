package com.streamliners.task0.introduction;

import java.util.Scanner;

public class RoundANumberToNDecimalPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int num = sc.nextInt();
        double result = Math.round(number*Math.pow(10,num))/Math.pow(10,num);
        System.out.println(result);
    }
}
