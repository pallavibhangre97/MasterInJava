package com.javalearning.geeksforgeeks;
import java.util.*;
public class SubArraywithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt(), s = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0, j = 0, flag = 0;
            while (j < n) {
                System.out.println("j=" + j);
                sum = sum + arr[j];
                System.out.println("sum=" + sum);
                j++;
                if (sum > s) {
                    i++;
                    j = i;
                    sum = 0;
                } else if (sum == s) {
                    System.out.println(i + 1 + " " + j);
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(-1);
            }
        }
    }
}
