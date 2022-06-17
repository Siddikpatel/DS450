package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] se = {3,-2,2,4,-1,3,-1};
        System.out.println("Array: " + Arrays.toString(se));
        int sum = 0,start=0, end=0;
        int max = -999;
        int len = se.length;
        for(int i = 0; i < len - 1; i++) {
            for(int j = i+1; j<len; j++) {
                for(int k = i; k <= j; k++) {
                    sum += se[k];
                }
                if(sum > max) {
                    start = i;
                    end = j;
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println("Substring array which has the largest sum is: " + "Sum = " + max + " Start = " + start + " End = " + end);
    }
}
