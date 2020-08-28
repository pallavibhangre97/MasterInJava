package com.javalearning.geeksforgeeks;
import java.util.*;
public class Train {
   public static void main(String[] args) {
        int arr[] = {70,90,15,17,12};
        int dep[] = {1,2,16,18,20};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0, max = 1, platform = 1;
        while (i < arr.length && j < dep.length) {
            if (arr[i] < dep[j]) {
                platform++;
                i++;

            } else {
                platform--;
                j++;
            }
            if (platform > max)
                    max = platform;
        }
        System.out.println(max);
    }
   /* static int findPlatform(int arr[], int dep[], int n)
   {
       // Sort arrival and departure arrays
       Arrays.sort(arr);
       Arrays.sort(dep);

       // plat_needed indicates number of platforms
       // needed at a time
       int plat_needed = 1, result = 1;
       int i = 1, j = 0;

       // Similar to merge in merge sort to process
       // all events in sorted order
       while (i < n && j < n) {
           // If next event in sorted order is arrival,
           // increment count of platforms needed
           if (arr[i] <= dep[j]) {
               plat_needed++;
               i++;
           }

           // Else decrement count of platforms needed
           else if (arr[i] > dep[j]) {
               plat_needed--;
               j++;
           }

           // Update result if needed
           if (plat_needed > result)
               result = plat_needed;
       }

       return result;
   }

    // Driver program to test methods of graph class
    public static void main(String[] args)
    {
        int arr[] = { 70,90,15,17,12 };
        int dep[] = { 1,2,16,18,20 };
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
    }*/
}
