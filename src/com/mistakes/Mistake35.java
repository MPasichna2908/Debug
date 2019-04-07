package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake35 {

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
            System.out.println("Садится водитель "
                    + this.getDriver().getName());
            this.driver = driver;
        }

        Driver getDriver() {
            return null;
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
