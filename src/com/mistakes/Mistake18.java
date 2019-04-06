package com.mistakes;

import java.util.Arrays;
import java.util.Random;

public class Mistake18 {

    /**
     * программа должна найти наибольший элемент массива
     *
     * здесь три ошибки
     */
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[] {
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        };

        System.out.println("Начальный массив: " + Arrays.toString(a));

        int max = -1;

        for (int i = 0; i <= a.length; i++) if (max < a[i - 1]) a[i] = max;

        System.out.println("Максимальный элемент: " + max);
    }
}
