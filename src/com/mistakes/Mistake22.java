package com.mistakes;

public class Mistake22 {

    private static Car car;

    public static void main(String[] args) {
        System.out.println(car.getName());
    }

    class Car {
        private String name;

        String getName() {
            return name;
        }
    }
}

