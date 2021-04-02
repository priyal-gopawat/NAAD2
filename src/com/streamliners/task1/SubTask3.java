package com.streamliners.task1;

public class SubTask3 {

    public static void main(String[] args) {
        System.out.println(isDirectlyProportional(new int[] {1,2,3,4}, new int[] {20,25,30,35}));
    }

    private static boolean isDirectlyProportional(int[] x, int[] y) {
        for (int i=1;i<x.length;i++)
        {
            if(x[i]<x[i-1])                                                 //2<1
            {
                if(y[i]>y[i-1])  return false;
            }
            else if(x[i]>x[i-1])                                          //2>1  true
            {
                if(y[i]<y[i-1])  return false;                           //25<20  false
            }
            else
            {
                if(y[i]!=y[i-1])  return false;
            }
        }


        return true;
    }

}
