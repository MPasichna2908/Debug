package com.mistakes;

import java.util.Arrays;

public class Mistake16 {

    /**
     * программа должна перевернуть изначальный массив и вывести его как 9, 8, 7... и т.д.
     */
    public static void main(String[] args) {
        int[] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - i] = tmp;
        }

        System.out.println(Arrays.toString(a));
    }
}
