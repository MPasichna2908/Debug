package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake25 {

    private static Car car1 = new Car("Toyota");
    private static Car car2 = new Car("Honda");
    private static Car car3;

    public static void main(String[] args) {

        if (car1.getName().startsWith("Toyota")) {

            System.out.println(car3.getName());

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
