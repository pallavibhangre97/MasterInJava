/* refer talent battle goldman sachs video for ans*/
package com.javalearning.interview;

import java.util.Arrays;

public class ArrayMul {
    public static void main(String args[]){
        int input[]=new int[5];
        for(int i=0;i<5;i++)
        {
            input[i]=i+1;
        }
        solution(input);

    }
    public static void solution(int[] input) {
        int leftArray[] = new int[input.length + 2];
        int rightArray[] = new int[input.length + 2];
        int output[] = new int[input.length];
        Arrays.fill(leftArray, 1);
        Arrays.fill(rightArray, 1);

        for (int i = 0; i < input.length; i++) {
            leftArray[i] = leftArray[i - 1] * input[i];
        }
        for (int i = 0; i < input.length; i++) {
            rightArray[i] = rightArray[i + 1] * input[i];
        }
        for (int i = 0; i < input.length; i++) {
            output[i] = leftArray[i - 1] * rightArray[i + 1];
        }
        for (int i : output) {
            System.out.println(i);
        }
    }
}
