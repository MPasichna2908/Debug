package com.mistakes;

/**
 * здесь четыре ошибки
 */
public class Mistake31 {

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = (Car) ((Object) new Car("Toyota"));
        cars[1] = (Car) ((Object) new Honda("Honda"));
        cars[2] = (Car) ((Object) new Toyota("Toyota"));
        cars[3] = (Car) ((Object) new Toyota("Toyota"));
        cars[4] = (Car) ((Object) new Car("Nissan"));

        for (int i = 0; i <= cars.length; i++) {
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

    static class Honda {
        private String name;

        Honda(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }

    static class Toyota {
        private String name;

        Toyota(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
}
