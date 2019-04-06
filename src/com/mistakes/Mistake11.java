package com.mistakes;

public class Mistake11 {

    //здесь две ошибки
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        System.out.println(a[5] / b[10]);
    }
}
