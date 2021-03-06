package com.project.siddik;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] a1 = {0, 2, 0, 1, 1, 0, 4, 54, 90, 18};
        int[] a2 = {2, -1, 4, -5, -9, 54, -911, 1, 18, 6, 5};

        System.out.println("Array 1: " + Arrays.toString(a1));
        System.out.println("Array 2: " + Arrays.toString(a2));

        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> layer = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int i : a1) {
            union.add(i);
            layer.add(i);
        }
        for(int i : a2) {
            union.add(i);
        }
        Arrays.sort(a2);
        for(int i : layer) {
            if(binarySearch(a2,i,0, a2.length-1)) {
                intersection.add(i);
            }
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

//        int len = a3.length;
//        Arrays.sort(a2);
//        Arrays.sort(a3);
//        int index = 0;
//        int unionIndex = 0;
//        int[] intersection = new int[len];
//        int[] union = new int[len * 2];
//        boolean[] contains = new boolean[10000];
//        boolean[] uContains = new boolean[10000];
//        for (int j : a2) {
//            int ogVal = j;
//            if (j < 0) {
//                j = -j;
//            }
//            if (!uContains[j]) {
//                union[unionIndex++] = ogVal;
//                uContains[j] = true;
//            }
//            if (!contains[j] && binarySearch(a3, ogVal, 0, len - 1)) {
//                intersection[index++] = ogVal;
//                contains[j] = true;
//            }
//        }
//        for (int i : a3) {
//            int ogVal = i;
//            if (i < 0) {
//                i = -i;
//                if (uContains[i]) {
//                    union[unionIndex++] = ogVal;
//                    continue;
//                }
//            }
//            if (!uContains[i] && !binarySearch(union, ogVal, 0, len - 1)) {
//                union[unionIndex++] = ogVal;
//                uContains[i] = true;
//            }
//        }
//        System.out.print("Intersection: ");
//        printArray(intersection, 0);
//        System.out.print("Union: ");
//        printArray(union, 0);
//        System.out.println("-----------------------------------------------------------------------------------------");
    }

//    public static void printArray(int[] arr, int skip) {
//        int len = arr.length;
//        StringBuilder sb = new StringBuilder();
//        sb.append("[").append(arr[0]).append(", ");
//        for (int i = 1; i < len; i++) {
//            if (arr[i] == skip) {
//                break;
//            }
//            sb.append(arr[i]).append(", ");
//        }
//        sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
//        sb.append("]");
//        System.out.println(sb);
//    }
//
    public static boolean binarySearch(int[] arr, int num, int left, int right) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (arr[mid] == num) {
                return true;
            } else {
                if (arr[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
                return binarySearch(arr, num, left, right);
            }
        }
        return false;
    }
}
