package com.javalearning.hackerrank.virtusaprep;
import java.util.*;
public class TwoString {

    static String twoStrings(String s1, String s2) {
        int string_arr[] = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            if(string_arr[s1.charAt(i)-'a']==0)
                string_arr[s1.charAt(i)-'a']++;

        }


        for(int i=0;i<s2.length();i++){
            if(string_arr[s2.charAt(i)-'a']==1)
                string_arr[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(string_arr[i]>1){
                return "YES";

            }

        }
        return "NO";
    }

    static public void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter strings : ");
        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        String result = twoStrings(s1, s2);
        System.out.println("result : " + result);
    }
}
