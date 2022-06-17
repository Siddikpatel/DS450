package com.project.siddik;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {

        int inputForThisProgram = 2;
        int[] se = {3, 1, 2, 3, 1, 5, 1};
        int len = se.length;
        for (int i = 0; i < len; i++) {
            if (se[i] - inputForThisProgram > 0) {
                se[i] = se[i] - inputForThisProgram;
            } else {
                se[i] = se[i] + inputForThisProgram;
            }
        }
        System.out.println("Original Array: " + Arrays.toString(se));
        System.out.println("Modified array = " + Arrays.toString(se));
        OptionalInt max1 = Arrays.stream(se).max();
        OptionalInt min1 = Arrays.stream(se).min();
        System.out.println("Difference between maximum and minimum height is: " + (max1.getAsInt() - min1.getAsInt()));
    }
}
