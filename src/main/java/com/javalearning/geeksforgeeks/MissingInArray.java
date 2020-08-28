package com.javalearning.geeksforgeeks;
import java.util.*;
public class MissingInArray {
    /*public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt(),missing=0;
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements:");
        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]!=i)
                missing=i;
        }
        if(missing==0){
            missing=n;
        }
        System.out.println("missing="+missing);
    }*/
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n,missing=0,sum,sum1;
        for(int i=0;i<t;i++)
        {
            sum=0;
            sum1=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=sc.nextInt();
                sum=sum+arr[j];
            }
            System.out.println("sum="+sum);
            sum1=n*(n+1)/2;
            System.out.println("sum1="+sum1);
            missing=sum1-sum;

            System.out.println(missing);
        }

    }
}
