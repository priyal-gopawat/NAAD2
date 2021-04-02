package com.streamliners.task0.introduction;

import java.util.Scanner;

public class WhitespaceFromAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strNew = str.replaceAll(" ","");
        System.out.println(strNew);
    }
}
