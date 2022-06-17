package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a1 = {5,1,4,2,7,3,6,9,10,8,13,11};
        System.out.println("Array = " + Arrays.toString(a1));
        int max = -999, prevMax = -999;
        int len = a1.length;
        for(int i = 0; i < len; i++) {
            if(a1[i] > max) {
                prevMax = max;
                max = a1[i];
            } else if (a1[i] > prevMax && max != -999) {
                prevMax = a1[i];
            }
        }
        System.out.println("2nd Max element = " + prevMax);
    }
}
