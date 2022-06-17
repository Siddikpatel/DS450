package com.project.siddik;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int[] se = {3,2,2,4,1,3,1,3,9,10,44,20,4};
        int len = se.length;
        System.out.println("Array: " + Arrays.toString(se));
        HashMap<Integer,Integer> hashMap1 = new HashMap<>();
        for(int i = 0; i < len; i++) {
            if(hashMap1.containsKey(se[i])) {
                hashMap1.put(se[i], hashMap1.get(se[i]) + 1);
            } else {
                hashMap1.put(se[i], 1);
            }
        }
        System.out.println("Duplicate values are: ");
        Set<Map.Entry<Integer,Integer>> set1 = hashMap1.entrySet();
        for(Map.Entry<Integer,Integer> m : set1) {
            if(m.getValue() > 1) {
                System.out.println(m.getKey());
            }
        }
    }
}
