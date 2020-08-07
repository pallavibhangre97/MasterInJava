
/*Write a program to input a set of words and group the anagrams together*/
package com.javalearning.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class AnagramGroup {
    public static int isAnagram(String s1, String s2) {
        int flag=0;
        /*System.out.println();
        System.out.println("String1:"+s1);
        System.out.println("String2:"+s2);*/
        if (s1.length() != s2.length()){
            flag=1;
            return flag;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                flag=1;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList();
        System.out.println("ENter number of words:");
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter word:");
            words[i] = sc.next();
        }
        System.out.println("Array of words");
        for(String s:words)
            System.out.print(s+" ");
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {
                int flag=isAnagram(words[i], words[j]);
                if(flag==0)
                {
                    al.add(words[i]);
                    al.add(words[j]);
                    System.out.println(al);
                    al.clear();
                }
            }
        }
    }
}