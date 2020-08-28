package com.javalearning.geeksforgeeks;
import java.util.*;
public class Leader {
    public static void main(String[] args) {
        int arr[]={2,1,0};
        int n=arr.length,flag=0,k=0;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<=n-2;i++)
        {
            flag=findLeader(arr,i,n-1);
            if(flag==i)
              list.add(arr[i]);
        }
        list.add(arr[n-1]);
        System.out.println("leaders are:");
       for(int i:list)
           System.out.print(i+" ");
    }
    static int findLeader(int arr[],int i,int n)
    {
        /*System.out.println("infun");
        System.out.println("arr[i]="+arr[i]);
        System.out.println("i="+i);
        System.out.println("n="+n);*/
        int flag=0;
        for(int j=i+1;j<=n;j++)
        {
           /* System.out.println("arr[i]"+arr[i]);
            System.out.println("arr[j]"+arr[j]);*/
            if(arr[i]>=arr[j])
                flag=i;
            else
                return -1;
        }
        return flag;
    }
}
/*Scan all the elements from right to left in an array and keep track of maximum till now.
 When maximum changes its value, print it.refer gfg for optimal solution
 * */