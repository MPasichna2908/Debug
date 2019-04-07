package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake39 {

    private static Driver vasya;

    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new Car(driver);

        driver.setName(null);
        car.setDriver(vasya);

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
            return driver;
        }

        void setDriver(Driver driver) {
            this.driver = driver;
        }
    }

    static class Driver {
        private String name;

        Driver() {

        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }
    }
}
