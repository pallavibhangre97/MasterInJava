package com.javalearning.matrix;

import java.util.*;
public class UserInput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=3,col=3;
        int matrix[][]=new int[row][col];
        System.out.println("Enter Matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
