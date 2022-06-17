package com.project.siddik;

public class Main {

    public static void main(String[] args) {

        int[] a1 = {5,1,4,2,7,3,-9,44};
        int len = a1.length;
        int max = a1[0],min = a1[0];
        for(int i = 1; i < len; i++) {
            if(a1[i] > max) {
                max = a1[i];
            }
            if(a1[i] < min) {
                min = a1[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
