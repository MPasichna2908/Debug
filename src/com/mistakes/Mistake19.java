package com.mistakes;

import java.util.Arrays;

public class Mistake19 {

    /**
     * алгоритм пузырьковой сортировки - программа должна вывести изначальный массив в отсортированном виде
     *
     * здесь три ошибки:
     * первая - приводит к аварийному завершению программы
     * вторая - приводит к тому что сортировка не работает, хотя программа ошибок не выдает
     * третья - приводит к аварийному завершению программы
     */
    public static void main(String[] args) {
        int[] a = new int[] {2, 0, 1, 3, 7, 6, 9, 8, 5};

        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[i]) {
                    int tmp = a[j];
                    a[j] = a[i - 1];
                    a[i] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
