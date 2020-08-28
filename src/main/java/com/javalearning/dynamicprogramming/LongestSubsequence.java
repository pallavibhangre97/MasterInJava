package com.javalearning.dynamicprogramming;
import java.util.*;
public class LongestSubsequence {
    static public void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two String");
        String str1=sc.next();
        String str2=sc.next();
        int s1=str1.length();
        int s2=str2.length(); //col=String1 row=String2

        System.out.println(s2);
        int t[][]=new int[s2+1][s1+1];
        for(int i=1;i<=s2;i++){
            for(int j=1;j<=s1;j++){
                if(str2.charAt(i-1)==str1.charAt(j-1))  //col=String1 row=String2
                    t[i][j]=t[i-1][j-1]+1;
                else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }

        }
        System.out.println("matrix:");
        for(int i=0;i<s2+1;i++){
            for(int j=0;j<s1+1;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("length="+t[s2][s1]);
    }
}
