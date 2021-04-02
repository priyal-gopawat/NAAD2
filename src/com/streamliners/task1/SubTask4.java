package com.streamliners.task1;

import java.util.*;

public class SubTask4 {
    public static void main(String[] args)
    {
        String s = "12332321";
        String replacements = "2R3S1T4D";
        if(!checkUsingRegExp(s, replacements)) {
            System.out.println("ERROR: The replacement string is not correct.");
            return;
        }
        System.out.println(modify(s,replacements));
    }
    private static String modify(String s, String replacements)
    {
        char[] ch = replacements.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            int index = replacements.indexOf(s.charAt(i))+1;
            sb.append(replacements.charAt(index));
        }
        return sb.toString();
    }
//    public static boolean checkCustomReg(String s, String replacements )
//    {
//        Set<Character> numStr = new HashSet<>();
//        for (int i = 0;i<s.length();i++)
//        {
//            numStr.add(s.charAt(i));
//        }
//        ArrayList<Character> numArr = new ArrayList<>(numStr);
//        ArrayList<Character> repArr = new ArrayList<>();
//        for (int i=0;i<replacements.length();i++)
//        {
//            repArr.add(replacements.charAt(i));
//        }
//        Collections.sort(repArr);
//        for(int i = 1; i<replacements.length();i+=2)
//        {
//            if(Character.isLetter(replacements.charAt(i))) continue;
//            return false;
//        }
//        if (!numArr.equals(repArr)) return false;
//        return true;
//    }
public static boolean checkUsingRegExp(String s, String replacements) {
    Set<Character> numericStringSet = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
        numericStringSet.add(s.charAt(i));
    }
    ArrayList<Character> numericStringArray = new ArrayList<>(numericStringSet);
    Collections.sort(numericStringArray);

    ArrayList<Character> numericReplacementsArray = new ArrayList<>();
    for (int i = 0; i < replacements.length(); i+=2) {
        numericReplacementsArray.add(replacements.charAt(i));
    }
    Collections.sort(numericReplacementsArray);

    if (!numericReplacementsArray.equals(numericStringArray)) {
        return false;
    }

    for (int i = 1; i < replacements.length(); i += 2) {
        if (Character.isLetter(replacements.charAt(i))) {
            continue;
        }
        return false;
    }

    return true;
}
}
