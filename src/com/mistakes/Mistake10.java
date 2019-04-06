package com.mistakes;

public class Mistake10 {

    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;

        System.out.println(a[2] + a[3]);
    }
}
