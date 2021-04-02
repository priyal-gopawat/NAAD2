package com.streamliners.task0.introduction;

import java.util.Scanner;

public class StringIsEmptyOrNull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str==null || str.isEmpty())
            System.out.println("string is null");
        else
            System.out.println("string is not null");

    }
}
