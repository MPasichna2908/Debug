package com.mistakes;

public class Mistake15 {

    public static void main(String[] args) {
        int[] a = new int[] {0, 1, 0, 3, 0, 0};
        int[] b = new int[] {5, 1, 1, 1, 1, 2};

        int x = 0;

        for (int c = 0; c <= a.length; c++) {
            x *= a[c] / b[c];
        }

        System.out.println(x);
    }
}
