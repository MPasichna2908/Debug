package com.mistakes;

public class Mistake14 {

    public static void main(String[] args) {
        int b = 3;
        int x = 0;

        for (int i = 0; i < 5; i++) {
            int[] a = new int[b - i];
            x = x + a.length;
        }

        System.out.println(x);
    }
}
