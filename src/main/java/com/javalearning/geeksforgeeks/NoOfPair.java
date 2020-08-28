package com.javalearning.geeksforgeeks;
import java.util.*;
public class NoOfPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={5, 6};
        int arr2[]={7,8,2};
        int count=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(Math.pow(arr1[i],arr2[j])>Math.pow(arr2[j],arr1[i]))
                count++;
            }
        }
        System.out.println("count="+count);
    }
}
