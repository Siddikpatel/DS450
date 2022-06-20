package com.project.siddik;

public class Main {

    public static void main(String[] args) {

        int[] a1 = {3,-1,2,11,5,-6,13};
        int[] a2 = {0,-1,5,7,13,45,66,90};
        int[] a3 = {-1,13,66,33,0,71};
        boolean isCommon = false;
        int iterations = 0;

        for(int i : a1) {
            iterations++;
            for(int j : a2) {
                iterations++;
                if(isCommon) {
                    if(i == j) {
                        break;
                    }
                    continue;
                }
                for(int k : a3) {
                    iterations++;
                    if(i == k) {
                        isCommon = true;
                        break;
                    }
                }
                if(!isCommon) {
                    break;
                }
            }
            if(isCommon) {
                System.out.println("Common element: " + i);
            }
            isCommon = false;
        }
        System.out.println("Total iteration = " + iterations);
    }
}
