package com.javalearning.hackerrank.virtusaprep;

/******************************************************************************
 Digonal difference

 *******************************************************************************/
import java.lang.*;
 class DigonalDiff
{
    public static void main(String[] args) {
        int arr[][]={{1,2,5},{6,7,8},{9,10,11}};
        int left=0,right=0,k=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j==arr.length-k){
                    left=left+arr[i][j];
                    k++;
                }
                if(i==j)
                    right=right+arr[i][j];
            }
        }
        System.out.println("left="+left+" "+"right="+right);
        int diff=left-right;
        System.out.println(Math.abs(diff));

    }
}

