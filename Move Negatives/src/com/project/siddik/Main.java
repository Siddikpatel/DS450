package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a3 = {2,-1,4,-5,-9,54,-911,1,10,-65,6,5};
        int len = a3.length, index = 0;
        int[] newArr = new int[len];
        int[] posPos = new int[len];
        for(int i = 0; i < len; i++) {
            if(a3[i] < 0) {
                newArr[index++] = a3[i];
                posPos[i] = 999;
            } else {
                posPos[i] = i;
            }
        }

        for(int i = 0; i < len; i++) {
            if(posPos[i] != 999) {
                newArr[index++] = a3[posPos[i]];
            }
        }
        System.out.println("Original: " + Arrays.toString(a3));
        System.out.println("One sided array: " + Arrays.toString(newArr));
    }
}
