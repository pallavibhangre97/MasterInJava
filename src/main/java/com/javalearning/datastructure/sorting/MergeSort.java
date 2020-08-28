package com.javalearning.datastructure.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={0 ,2 ,1, 2, 0};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void mergeSort(int arr[],int s,int e)
    {
       // System.out.println("s="+s+" "+"e="+e);
        if(s==e)
        {
            return;
        }
        int mid=(s+e)/2;
       // System.out.println("first merge sort:");
        mergeSort(arr,s,mid);
        //System.out.println("second merge sort:");
        mergeSort(arr,mid+1,e);
        //System.out.println(" merge method:");
        merge(arr,s,e);

    }
    static void merge(int arr[],int s,int e)
    {
        int mid=(s+e)/2;
        int i=s,j=mid+1,k=s;
        int temp[]=new int[arr.length];
        while(i<=mid && j<=e)
        {
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }
        while(i<=mid)
            temp[k++]=arr[i++];
        while(j<=e)
            temp[k++]=arr[j++];
        for(int l=s;l<=e;l++)
            arr[l]=temp[l];
        //for(int l=s;l<=e;l++)
            //System.out.print(arr[l]+" ");
    }
}
