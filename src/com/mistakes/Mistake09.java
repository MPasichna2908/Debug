package com.mistakes;

public class Mistake09 {

    public static void main(String[] args) {
        int a = 10;
        double b = 10.999;

        do {
            a = a * 2;
            b = b / 2;
        } while (a / (int) b >= 0);

        System.out.println(a);
    }
}
