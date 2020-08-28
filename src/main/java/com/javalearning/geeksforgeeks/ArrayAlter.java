package com.javalearning.geeksforgeeks;

import java.util.Scanner;

public class ArrayAlter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),n,len,i,j,k,p;
        for(int a=0;a<t;a++)
        {
            n=sc.nextInt();
            int arr[]=new int[n];
            int res[]=new int[n];
            for(int o=0;o<n;o++){
                arr[o]=sc.nextInt();
            }
            len=arr.length;
            i=p=0;
            j=len-1;
            k=(len/2);
            while(i<k)
            {

                res[p] = arr[j++];
                res[p+1] = arr[i++];
               /* i++;
                j--;*/
                p += 2;

            }
            if(len%2!=0)
                res[p]=arr[i];
            for(int l:res)
            {
                System.out.print(l+" ");
            }

        }
       /* int[] arr={0,2,3,4,5,6,10};
        int len=arr.length;
        int i=0,j=len-1,k=(len/2),p=0;
        int res[]=new int[7];

        while(i<k) {

                res[p] = arr[j];
                res[p+1] = arr[i];
                i++;
                j--;
                p += 2;

        }
        if(len%2!=0)
            res[p]=arr[i];
        System.out.println("Array :");
        for(int l:res)
        {
            System.out.print(l+" ");
        }*/
    }
}
