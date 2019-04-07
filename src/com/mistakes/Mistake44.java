package com.mistakes;

public class Mistake44 {

    public static void main(String[] args) {
        Bank alphaBank = new Bank("Alpha");

        alphaBank.addAccount(
                new Account(
                        new Owner("Vasya"),
                        new Money(140.00, "UAH")));

        alphaBank.addAccount(
                new Account(
                        new Owner("Kolya"),
                        new Money(210.00, "UAH")));

        alphaBank.addAccount(
                new Account(
                        new Owner("Petya"),
                        new Money(330.00, "UAH")));

        alphaBank.addAccount(
                new Account(
                        new Owner("Olga"),
                        new Money(300.00, "UAH")));

        System.out.println("деньги положены в банк");
    }

    static class Bank {
        private String name;
        private Account[] accounts = new Account[10];
        private int numberOfAccounts;

        Bank(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        Account[] getAccounts() {
            return accounts;
        }

        void addAccount(Account account) {
            accounts[numberOfAccounts] = account;
            numberOfAccounts++;
        }
    }

    static class Account {
        private Owner owner;
        private Money money;

        Account(Owner owner, Money money) {
            System.out.println("Поздравляем "
                    + this.owner.getName()
                    + " вы открыли счет");
            this.owner = owner;
            this.money = money;
        }
    }

    static class Owner {
        private String name;

        Owner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Money {
        private double amount;
        private String currency;

        Money(double amount, String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        public double getAmount() {
            return amount;
        }

        public String getCurrency() {
            return currency;
        }
    }
}
