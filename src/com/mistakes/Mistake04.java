package com.mistakes;

public class Mistake04 {

    public static void main(String[] args) {
        int a = 5000;

        for (int b = 2; b > -2; b--) {
            a = a / b;
        }

        System.out.println(a);
    }
}
