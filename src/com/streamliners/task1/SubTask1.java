package com.streamliners.task1;

public class SubTask1 {

    public static void main(String[] args) {
        String str = modify("12332321", "2R3S1T4D");
        System.out.println(modify("12332321", "2R3S1T4D"));
    }

    private static String modify(String s, String replacements) {
        char[] ch = replacements.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            int index = replacements.indexOf(s.charAt(i))+1;
            sb.append(replacements.charAt(index));
        }
        return sb.toString();
    }

}
