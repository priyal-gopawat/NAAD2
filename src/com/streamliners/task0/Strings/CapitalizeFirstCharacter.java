package com.streamliners.task0.Strings;

import java.util.Scanner;

public class CapitalizeFirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean space = true;
        char[] ch = str.toCharArray();
        for (int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i))){
                if (space)
                {
                    ch[i] = Character.toUpperCase(str.charAt(i));
                    space = false;
                }
            }
            else
                space = true;
        }
        str = String.valueOf(ch);
        System.out.println(str);

    }
}
