package com.mistakes;

import java.util.Arrays;

public class Mistake17 {

    /**
     * программа должна с помощью цикла поменять местами нулевой и девятый элементы массива
     *
     * при работе программа ошибку не выдает но работает неправильно
     * здесь две ошибки
     */
    public static void main(String[] args) {
        int[] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int c = 0; c < 2; c++) {
            int tmp = a[c];
            a[a.length - c - 1] = tmp;
            a[c] = a[a.length - c - 1];
        }

        System.out.println(Arrays.toString(a));
    }
}
