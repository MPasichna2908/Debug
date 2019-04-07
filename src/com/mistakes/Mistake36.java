package com.mistakes;

/**
 * здесь три ошибки
 */
public class Mistake36 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new Car(driver);

        if (car.getDriver().getName().equals("Vasya")) {
            System.out.println("лови бонус");
        }
    }

    static class Car {
        private Driver driver;

        Car(Driver driver) {
            System.out.println("Привет водила "
                    + this.getDriver().getName());
            driver = driver;
        }

        Driver getDriver() {
            return driver;
        }
    }

    static class Driver {
        private String name;

        Driver() {

        }

        Driver(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
}
