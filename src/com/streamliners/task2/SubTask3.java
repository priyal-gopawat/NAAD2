package com.streamliners.task2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SubTask3 {

    public static void main(String[] args) {
        startGame("SHAMBHO");
    }

    private static void startGame(String s) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(s);               //SHAMBO
        StringBuilder sbReplace = new StringBuilder(s);
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(!(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') ){
               sbReplace.setCharAt(i,'_');                 //__A___O
                count++;                                      //5
             }
        }
        int chances = count + 3;                             //8
        while(chances--!=0)
        {
            System.out.println("Word :"+sbReplace+"\nChances :"+chances);            //Word : __A___O  //Chances : 8
            System.out.print("Guess : ");
            char ch = sc.next().charAt(0);                                         //forex- STARTGAME (t is repeating 2 times)
            ch = Character.toUpperCase(ch);
            ArrayList<Integer> arr = new ArrayList<>();                                   //__A___A_E
            int search = 0;
            while(true)
            {
                int index = s.indexOf(ch,search);
                if(index==-1) break;
                else
                {
                    arr.add(index);
                    search = index +1;
                }
            }
            int count1 =0;
            for(int i=0;i<arr.size();i++)
            {
                if(sbReplace.charAt(arr.get(i))=='_')
                {
                    sbReplace.setCharAt(arr.get(i),ch);
                    count1++;
                }
            }
            count = count - count1;
            if(count==0)
            {
                System.out.println(sbReplace);
                System.out.println("Wins");
                return;
            }
            System.out.println("Character found "+count1+" time(s)!\n");
        }
        System.out.println("Lost");
    }
}
