package com.javalearning.geeksforgeeks;

import java.util.Arrays;

public class Merge2Array {
    public static void main(String[] args) {
        int[] arr1={1,2,3,8};
        int[] arr2={1,4,5,6,7};
        int res[]=new int[9];
        int k=0;
        for(int i=0;i<(4+5);i++)
        {
            if(i<4)
                res[i]=arr1[i];
            else {

                res[i] = arr2[k++];
               // k++;
            }
        }
        System.out.println("merged array:");

        Arrays.sort(res);
        for(int i=0;i<(4+5);i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
