package com.mistakes;

public class Mistake26 {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Nissan");

        if (car1.getName().startsWith("Toyota")) {

            System.out.println(car1.getName());

        } else if (car2.getName().startsWith("Honda")) {

            System.out.println(car2.getName());

        } else if (car3.getName().startsWith("Honda")) {

            System.out.println(car3.getName());
        }
    }

    static class Car {
        private String name;

        Car(String name) {
            this.name = name;
        }

        String getName() {
            return null;
        }
    }
}
