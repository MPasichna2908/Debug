package com.mistakes;

public class Mistake08 {

    public static void main(String[] args) {
        int a = 50;
        double b = a / 100;
        int c = (int) b;

        System.out.println(a / c);
    }
}
