package com.mistakes;

/**
 * здесь четыре ошибки
 */
public class Mistake24 {

    private static Car car1;
    private static Car car2;
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
