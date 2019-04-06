package com.mistakes;

public class Mistake13 {

    public static void main(String[] args) {
        int[] a = new int[] {0, 1, 2, 3, 4, 5};
        int[] b = new int[] {5, 4, 3, 2, 1, 0};

        int x = 0;

        for (int c = 0; c < a.length; c++) {
            x *= a[c] / b[c];
        }

        System.out.println(x);
    }
}
