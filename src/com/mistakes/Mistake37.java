package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake37 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new Car(driver);

        if (car.getDriver().getName().equals("Vasya")) {
            System.out.println("лови бонус");
        }
    }

    static class Car {
        private Driver driver;

        {
            System.out.println("Привет водила " + this.getDriver().getName());
        }

        Car(Driver driver) {
            this.driver = driver;
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
