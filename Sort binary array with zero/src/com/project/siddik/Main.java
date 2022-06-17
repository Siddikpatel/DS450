package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a2 = {0,2,0,1,1,0,1,2,0};
        int len = a2.length;
        System.out.println("Original: " + Arrays.toString(a2));
        int twos = 0, ones = 0, index = 0;
        for(int i = 0; i < len; i++) {
            if(a2[i] == 2) {
                twos++;
            } else if(a2[i] == 1) {
                ones++;
            } else {
                a2[index++] = 0;
            }
        }
        for(int i = 1; i <= ones; i++) {
            a2[index++] = 1;
        }
        for(int i = 1; i <= twos; i++) {
            a2[index++] = 2;
        }
        System.out.println("Sorted: " + Arrays.toString(a2));
    }
}
