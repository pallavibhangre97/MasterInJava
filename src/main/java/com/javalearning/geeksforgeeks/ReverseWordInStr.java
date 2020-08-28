/*Reverse words in a given string
first split str by dot.then convert it into list and reverse it then create stringbuffer obj and
append all words and print it
*
* */
package com.javalearning.geeksforgeeks;
import java.util.*;
public class ReverseWordInStr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of test cases:");
        int t=sc.nextInt();
        System.out.println("Enter String in which words are seperated by dot");
        String str=sc.next();
        String str_Split[]=str.split("\\.");
        List<String> list=Arrays.asList(str_Split);
        Collections.reverse(list);
        //String[] reverse=list.toArray(str_Split);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
            if(i!=list.size()-1)
            sb.append(".");
        }
       /* String out=sb.toString();
        System.out.println(out);*/
        System.out.println(sb);

    }
}