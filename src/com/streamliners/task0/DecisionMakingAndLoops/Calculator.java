package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter operation to perform");
        char n = sc.next().charAt(0);
        switch (n)
        {
            case '+':
                int sum = a+b;
                System.out.println("sum is : " +sum );
                break;


            case '-':
                int sum1 = a-b;
                System.out.println("difference is : " +sum1 );
                break;


            case '*':
                int sum2 = a*b;
                System.out.println("multiplication is : " +sum2 );
                break;

            case '/':
                int sum3 = a/b;
                System.out.println("division is : " +sum3 );
                break;

            case '%':
            int sum4 = a%b;
            System.out.println("remainder is : " +sum4 );
            break;

            default :
                System.out.println("invalid character");


        }
    }
}
