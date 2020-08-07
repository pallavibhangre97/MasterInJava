package com.javalearning.searching;

import java.util.Scanner;

public class BinarySearch {
    public static void searchElement(int arr[],int no){
        int start=0,end=arr.length-1,pos=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(no==arr[mid]){
                pos=mid;
                break;
            }
            else if(no<mid){
                end=mid-1;
            }
            else if(no>mid)
            {
                start=mid+1;
            }
        }
        if(pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "+pos+" position");

    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Number To be Search:");
        int no=sc.nextInt();
       searchElement(arr,no);



    }
}
