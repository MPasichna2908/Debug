package com.mistakes;

public class Mistake20 {

    public static void main(String[] args) {
        int[] a = new int[Integer.MAX_VALUE];

        System.out.println(a[0] + a[1] + a[2] + a[50_000]);
    }
}
