package com.mistakes;

public class Mistake05 {

    public static void main(String[] args) {
        int a = 5000;

        for (int b = 4; b > -4; b--) {
            if (b == 0) {
                a /= b;
            }
        }

        System.out.println(a);
    }
}
