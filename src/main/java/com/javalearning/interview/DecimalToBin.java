package com.javalearning.interview;

import java.util.ArrayList;
import java.util.Collections;

public class DecimalToBin {

    public static ArrayList decToBin(int a){
        int count=0;
        ArrayList al=new ArrayList();

        while(a>0)
        {
            if(a%2==1)
                count++;
            al.add(a%2);

            a=a/2;



        }
        al.add(count);
        Collections.reverse(al);

        ArrayList al1=new ArrayList();
        al1.add(al.get(0));

        for(int i=1;i<al.size();i++)
        {
            if(al.get(i)==(Object)1)
                al1.add(i);
        }

        return al1;
    }


    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al=decToBin(161);
        System.out.println(al);

    }
}

