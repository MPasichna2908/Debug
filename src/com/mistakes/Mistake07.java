package com.mistakes;

public class Mistake07 {

    public static void main(String[] args) {
        int a = 100_000_000;
        int c = 200_000_000;
        byte b = (byte) a;

        System.out.println(c / b);
    }
}
