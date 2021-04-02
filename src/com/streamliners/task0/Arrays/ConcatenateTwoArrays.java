package com.streamliners.task0.Arrays;

import java.util.Scanner;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = { 1,3,4,5};
        int[] arr2 = {2,6,7,8};
        int[] combine = new int[arr1.length+arr2.length];
        for(int i=0;i<(arr1.length+arr2.length);i++)
        {
            if(i< arr1.length){
                combine[i] = arr1[i];
            }
            else{
                combine[i]=arr2[i-arr1.length];

            }
        }
        for(int i=0;i<(arr1.length+arr2.length);i++){
            System.out.print(combine[i]+ " ");
        }
    }
}
