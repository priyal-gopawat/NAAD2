package com.streamliners.task1;

public class SubTask2 {

    public static void main(String[] args) {
        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }

    private static int totalWeight(String s, int[] weights) {
        int sum = 0;
        for (int i =0 ; i<s.length();i++)
        {
            int index = s.charAt(i)-65;
            sum+=weights[index];
        }

        return sum;
    }

}
