package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake28 {

    public static void main(String[] args) {
        Car[] cars = new Car[5];

        System.out.println(cars[1].getName());
        System.out.println(cars[2].getName());
        System.out.println(cars[5].getName());
    }

    static class Car {
        private String name;

        String getName() {
            return name;
        }
    }
}
