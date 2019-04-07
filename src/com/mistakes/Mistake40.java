package com.mistakes;

/**
 * здесь три ошибки
 */
public class Mistake40 {

    private static Driver vasya;

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
            this.driver = driver;
        }

        Driver getDriver() {
            return vasya;
        }
    }

    static class Driver {
        private String name;

        Driver(String name) {
            name = name;
        }

        String getName() {
            return vasya.getName();
        }
    }
}
