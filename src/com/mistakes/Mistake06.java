package com.mistakes;

public class Mistake06 {

    public static void main(String[] args) {
        int a = 50;
        int b = 5;

        while (10 > b && b > -10) {
            b--;
            a = a / b;
        }

        System.out.println(a);
    }
}
