package com.javalearning.geeksforgeeks;
import java.util.*;
public class ArrayInversion {

    public static void main(String[] args) {
        int arr[]={3, 1, 2 };

        System.out.println("Inversion count is " + mergeSort(arr,0,arr.length-1) );
       // System.out.println("count="+cnt);
    }
    static int mergeSort(int arr[],int s,int e)
    {

        if(s>=e)
            return 0;
        int cnt=0;
        int mid=(s+e)/2;
        cnt+=mergeSort(arr,s,mid);
        cnt+=mergeSort(arr,mid+1,e);
        cnt+=merge(arr,s,e);
        return cnt;

    }
    static int merge(int arr[],int s,int e)
    {
        int cnt=0;
        int mid=(s+e)/2;
        int i=s,j=mid+1,k=s;
        int temp[]=new int[arr.length];

        while(i<=mid && j<=e) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];

            else {
                temp[k++] = arr[j++];
                cnt += (mid-i+1);
            }
        }

       while(i<=mid)
            temp[k++]=arr[i++];
        while(j<=e)
            temp[k++]=arr[j++];
        for(int l=s;l<e;l++)
            arr[l]=temp[l];
        return cnt;

    }
    /*

    public static int merge(int[] arr, int[] aux, int low, int mid, int high)
    {
        int k = low, i = low, j = mid + 1;
        int inversionCount = 0;

        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
                inversionCount += (mid - i + 1);
            }
        }


        while (i <= mid)
            aux[k++] = arr[i++];

        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }

        return inversionCount;
    }

    // Sort array arr [low..high] using auxiliary array aux
    public static int mergeSort(int[] arr, int[] aux, int low, int high)
    {
        if (high == low)
            return 0;

        int mid = (low+high)/2;
        int inversionCount = 0;

        inversionCount += mergeSort(arr, aux, low, mid);
        inversionCount += mergeSort(arr, aux, mid + 1, high);
        inversionCount += merge(arr, aux, low, mid, high);

        return inversionCount;
    }

    public static void main(String[] args)
    {
        int[] arr = {3, 1, 2 };
        int[] aux = Arrays.copyOf(arr, arr.length);
        System.out.println("Inversion count is " +
                mergeSort(arr, aux, 0, arr.length - 1));
    }
     */

}

