package com.mistakes;

public class Mistake30 {

    public static void main(String[] args) {
        Car[] cars = new Car[10];

        for (int i = 0; i < 10; i++) {
            if (i * 55 % 6 == i % 2) {
                cars[i] = new Car();
            }
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getName());
        }
    }

    static class Car {
        private String name;

        String getName() {
            return name;
        }
    }
}
