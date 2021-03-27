package com.streamliners.task0.introduction;

import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double D = b*b -4*a*c;
        if (D>=0) {
            double root1 = (-b + Math.sqrt(D)) / 2 * a;
            double root2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("roots of equation are " + root1 + " " + root2);
        }
        else {
            double real = -b/(2*a);
            double im = Math.sqrt(-D)/(2*a);
            System.out.println("The roots of the equation are " + real + " + " + im + "i" + " and " + real + " - " + im + "i");
        }





    }
}
