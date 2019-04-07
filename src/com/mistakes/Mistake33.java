package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake33 {

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
            return driver;
        }
    }

    static class Driver {
        private String name;

        Driver(String name) {
            name = name;
        }

        String getName() {
            return name;
        }
    }
}
