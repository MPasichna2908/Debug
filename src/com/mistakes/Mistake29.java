package com.mistakes;

/**
 * здесь три ошибки
 */
public class Mistake29 {

    public static void main(String[] args) {
        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length - 1; i++) {
            cars[i] = new Car("Car number " + i);
        }

        for (int i = cars.length; i > 0; i--) {
            System.out.println(cars[i].getName());
        }
    }

    static class Car {
        private String name;

        Car(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
}
