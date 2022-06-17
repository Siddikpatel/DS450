package com.project.siddik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int cases = scanner.nextInt();
        int[] answers = new int[cases];
        do {
            int terms = scanner.nextInt();
            scanner.nextLine();
            String coeffs = scanner.nextLine();
            if(terms == 1) {
                answers[index++] = 0;
            } else {
                String[] elements = coeffs.split(" ");
                if(!elements[terms-1].equals("0")) {
                    answers[index++] = terms-1;
                } else {
                    for(int i = terms - 2; i != 0; i--) {
                        if(!elements[i].equals("0")) {
                            answers[index++] = i;
                            break;
                        }
                    }
                }
            }
            cases--;
        } while (cases != 0);
        for(int i : answers) {
            System.out.println(i);
        }
    }
}
