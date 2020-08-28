package com.javalearning.geeksforgeeks;

public class Equilibrium {
    public static void main(String[] args) {
        int arr[]={2,1,4,1,1,1};
        int left=0,right=0,flag=0;
        for(int i=1;i<arr.length-1;i++)
        {
            System.out.println("i="+i);
             left=leftSum(arr,0,i-1);
            System.out.println("leftsum="+left);
             right=rightSum(arr,i+1,arr.length-1);
            System.out.println("rightsum="+right);
            if(left==right)
                flag=i;
            System.out.println("flag="+flag);
        }
        if(flag!=0)
            System.out.println("point="+flag);
        else
            System.out.println(-1);
    }
    static int leftSum(int arr[],int s,int e ){
        int sum=0;
        for(int i=s;i<=e;i++)
            sum=sum+arr[i];
        return sum;
    }
    static int rightSum(int arr[],int s,int e ){
        int sum=0;
        for(int i=s;i<=e;i++)
            sum=sum+arr[i];
        return sum;
    }
}
