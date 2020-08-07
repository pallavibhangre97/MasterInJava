/*how many ways given natural number made from sum of two or more consecutive natural no*/


package com.javalearning.interview;

import java.util.Scanner;

public class ConsecutiveSum {
    public static void solution(int N)
    {
        int count=0;
        int n=2;//consecutive natural no two or more,n is no of consecutive no
        float a=0;
        while((2*N+n-n*n)>0)
        {
            a=(2 * N + n -(int) Math.pow(n,2));//a is first first no in consecutive series
            a=a/(2*n);
            System.out.println(a);

            if(a-(int)a==0)//check if a is not fractional no
            count+=1;
            n+=1;
        }
        System.out.println("ans="+count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int n=sc.nextInt();
        solution(n);
    }
}
