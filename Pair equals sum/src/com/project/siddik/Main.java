package com.project.siddik;

public class Main {

    public static void main(String[] args) {

        int[] a1 = {1,4,6,-1,3,0,9,1};
        int len = a1.length;
        int sum = 5;
        boolean[][] isRead = new boolean[len][len];

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(i != j && !isRead[i][j]) {
                    if(a1[i] + a1[j] == sum) {
                        System.out.println("Pair: [" + a1[i] + ", " + a1[j] + "]");
                        isRead[i][j] = true;
                        isRead[j][i] = true;
                    }
                }
            }
        }
    }
}