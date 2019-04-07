package com.mistakes;

public class Mistake23 {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        if (car1.getName().startsWith("Toyota")) {

            System.out.println(car1.getName());

        } else if (car2.getName().startsWith("Honda")) {

            System.out.println(car2.getName());
        }
    }

    static class Car {
        private String name;

        Car(String name) {

        }

        String getName() {
            return name;
        }
    }
}
