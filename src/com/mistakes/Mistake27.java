package com.mistakes;

import java.util.Arrays;

public class Mistake27 {

    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();
        cars[3] = new Car();
        cars[4] = new Car();
        cars[5] = new Car();

        System.out.println(Arrays.toString(cars));
    }

    static class Car {
        private String name;

        String getName() {
            return name;
        }
    }
}
