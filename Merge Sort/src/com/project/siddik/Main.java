package com.project.siddik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a2 = {3,1,0,-2,5,11,90,12,6,-7,-8,99,4};
        System.out.println("Unsorted array: " + Arrays.toString(a2));
        sort(a2,0, a2.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(a2));
    }

    public static void merge(int[] arr, int l, int m, int r) {
        // sizes of new arrays to be merged
        int s1 = m - l + 1;
        int s2 = r - m;

        // create temp arrays
        int[] leftArr = new int[s1];
        int[] rightArr = new int[s2];

        // copy data to temp array
        for(int i = 0; i < s1; i++)
            leftArr[i] = arr[l+i];
        for(int i = 0; i < s2; i++)
            rightArr[i] = arr[m+1+i];

        /* merge these temp arrays */

        // initial indexes of left and right array
        int i = 0, j = 0;
        // initial index of merged sub-array array
        int k = l;

        while(i < s1 && j < s2) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left array if any
        while (i < s1) {
            arr[k] = leftArr[i];
            k++;
            i++;
        }
        // copy remaining elements of right array if any
        while (j < s2) {
            arr[k] = rightArr[j];
            k++;
            j++;
        }
    }

    // Function that sorts the arr[l...r] using merge
    public static void sort(int[] arr, int l, int r) {
        if(l < r) {
            // find the middle point
            int m = l + (r-l)/2;
            // sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}