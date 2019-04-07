package com.mistakes;

public class Mistake32 {

    public static void main(String[] args) {
        Driver driver = new Driver("Vasya");
        Car car = new Car(driver);

        System.out.println(car.getDriver().getName());
    }

    static class Car {
        private Driver driver;

        Car(Driver driver) {

        }

        Driver getDriver() {
            return driver;
        }
    }

    static class Driver {
        private String name;

        Driver(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
}
