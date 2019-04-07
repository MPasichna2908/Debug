package com.mistakes;

/**
 * здесь четыре ошибки
 */
public class Mistake34 {

    public static void main(String[] args) {
        Driver driver = new Driver("Vasya");
        Car car = new Car(driver);

        if (car.getDriver().getName().equals("Vasya")) {
            System.out.println("лови бонус");
        }
    }

    static class Car {
        private Driver driver;

        Car(Driver driver) {
            driver = driver;
        }

        Driver getDriver() {
            return null;
        }
    }

    static class Driver {
        private String name;

        Driver(String name) {
            name = name;
        }

        String getName() {
            return null;
        }
    }
}
