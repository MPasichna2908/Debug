package com.mistakes;

public class Mistake03 {

    public static void main(String[] args) {
        int a = 5000;

        for (int b = 0; b < 5; b++) {
            a = a / b;
        }

        System.out.println(a);
    }
}
