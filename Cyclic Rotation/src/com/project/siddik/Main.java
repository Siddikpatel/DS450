package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a3 = {2,-1,4,-5,-9,54,-911,1,6,5,1};
        System.out.println("Original: " + Arrays.toString(a3));
        int len = a3.length;
        int change = a3[len-1];
        for(int i = 0; i < len; i++) {
            int temp = a3[i];
            a3[i] = change;
            change = temp;
        }
        System.out.println("Rotated: " + Arrays.toString(a3));
    }
}
