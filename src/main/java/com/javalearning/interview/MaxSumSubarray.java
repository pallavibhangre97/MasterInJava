/*Refer Maximum Sum Subarray Problem - Kadane's Algorithm from prepbytes channel*/
package com.javalearning.interview;
import java.util.*;

public class MaxSumSubarray {

        public static void maxSum(int arr[],int n){
           /* time complexity O(n2)

           int maxSum=0;
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i;j<n;j++){
                    sum+=arr[j];
                    if(sum>maxSum)
                        maxSum=sum;
                }
            }*/
            //below code is of time complexity O(1)
            int max=arr[0],maxSum=arr[0];
            for(int i=1;i<n;i++)
            {
                //maxSum=max(arr[i],maxSum+arr[i])
               int res=maxSum+arr[i];
               if(res>arr[i])
                   maxSum=res;
               else
                   maxSum=arr[i];
               if(maxSum>max)
                   max=maxSum;
            }
            System.out.println(max);
        }

    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxSum(arr,n);
    }
}
