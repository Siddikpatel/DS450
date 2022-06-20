package com.project.siddik;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long val = 99;
        System.out.println(factorial(BigInteger.valueOf(val)));

    }

    public static BigInteger factorial(BigInteger num) {
        if(num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return num.multiply(BigInteger.valueOf(num.longValue()).subtract(BigInteger.ONE));
        }
    }
}
