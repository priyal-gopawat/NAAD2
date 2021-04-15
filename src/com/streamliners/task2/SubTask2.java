package com.streamliners.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubTask2 {

    public static void main(String[] args) {
        System.out.println(getOccurrencesHashMap("1;2;2;2;3;1"));
    }

    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        String[] str = s.split(";");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< str.length;i++)
        {
            arr.add(Integer.parseInt(str[i]));
        }
        Set<Integer> p =  new HashSet<>();
        for(int i=0;i<arr.size();i++)
        {
            p.add(arr.get(i));
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrNum = new ArrayList<>(p);
        for(int i=0;i<arrNum.size();i++)
        {
            hashMap.put(arrNum.get(i),0);
        }
        for (int i=0;i< arr.size();i++)
        {
            hashMap.replace(arr.get(i),hashMap.get(arr.get(i)), hashMap.get(arr.get(i))+1 );
        }
        return hashMap;
    }

}
