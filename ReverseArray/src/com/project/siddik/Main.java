package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------------------------");
        int[] a1 = {-1,4,10,5,9,4,2};
        int len = a1.length;
        int[] rev = new int[len];
        for(int i = len; i > 0; i--) {
            rev[len-i] = a1[i-1];
        }
        System.out.println("Original: " + Arrays.toString(a1));
        System.out.println("Reversed: " + Arrays.toString(rev));
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
