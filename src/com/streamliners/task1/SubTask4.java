package com.streamliners.task1;

import java.util.*;

public class SubTask4 {
    public static void main(String[] args)
    {
        String s = "12332321";
        String replacements = "3S1T4D";
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

    for (int i=0;i< numericStringSet.size();i++){
        if (numericStringArray.get(i) == numericReplacementsArray.get(i)) continue;
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
