package com.streamliners.task2;

import java.util.ArrayList;
import java.util.List;

public class SubTask1 {

    public static void main(String[] args) {

        System.out.println(getList("1;2;3;4"));
    }

    private static List<Integer> getList(String s)
    {
        String[] arr = s.split(";");
        List<Integer> a = new ArrayList<>();
        for(int i=0;i< arr.length;i++)
        {
            a.add(Integer.parseInt(arr[i]));
        }
        return a;
    }

}
