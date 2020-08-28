package com.javalearning.geeksforgeeks;
import java.util.*;
public class Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;

        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < n - 2; i++) {
            /*int j=i+1;
            int res=arr[i] + arr[j];
            System.out.println("res="+res);
          //  System.out.println("arr[i]"+arr[i]);
           // System.out.println("arr[j]"+arr[j]);
           // System.out.println("arr[m]"+arr[m]);
            for(int m=i+2;m<n;m++) {
                System.out.println("arr[m]"+arr[m]);
                if (  arr[m]==res) {
                    count++;
                    System.out.println("count="+count);
                    break;
                }*/
            for (int j = i + 1; j < n; j++) {
                int res = arr[i] + arr[j];
                for (int m = j + 1; m < n; m++) {
                    System.out.println("arr[m]" + arr[m]);
                    if (arr[m] == res) {
                        count++;
                        System.out.println("count=" + count);
                        break;
                    }
                }
            }
        }

    }
    }

