package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] se = {3,2,2,4,1,3,1,6,1,4,2,1,1,1,1,2,1,2,3,1};
        int nextElement = se[0], jumps = 0;
        int index = 0;
        int len = se.length;
        System.out.println("Array: " + Arrays.toString(se));
        while (true) {
            index += nextElement;
            if(index > len - 1) {
                if(se[len-1] != nextElement) {
                    jumps++;
                }
                break;
            }
            nextElement = se[index];
            jumps++;
        }
        System.out.println("Jumps needed to move from start to end of the array are: " + jumps);
    }
}
