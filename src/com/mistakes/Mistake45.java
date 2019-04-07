package com.mistakes;

public class Mistake45 {

    public static void main(String[] args) {
        Bank alphaBank = new Bank("Alpha");

        alphaBank.addAccount(
                new Account(
                        new Owner("Vasya"),
                        new Money(170.00, "UAH")));

        alphaBank.addAccount(
                new Account(
                        new Owner("Kolya"),
                        new Money(210.00, "UAH")));

        alphaBank.addAccount(
                new Account(
                        new Owner("Petya"),
                        new Money(337.00, "UAH")));

        alphaBank.addAccount(
                new Account(
                        new Owner("Olga"),
                        new Money(360.00, "UAH")));

        System.out.println("деньги положены в банк");

        for (int i = 0; i < alphaBank.getNumberOfAccounts(); i++) {
            Account account = alphaBank.getAccountByNumber(i);

            System.out.println(account.getOwner().getName());
            System.out.println(account.getMoney().getAmount());
        }
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

        int getNumberOfAccounts() {
            return accounts.length;
        }

        Account getAccountByNumber(int accountNumber) {
            return accounts[accountNumber];
        }
    }

    static class Account {
        private Owner owner;
        private Money money;

        Account(Owner owner, Money money) {
            this.owner = owner;
            this.money = money;
        }

        Owner getOwner() {
            return owner;
        }

        Money getMoney() {
            return money;
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

        double getAmount() {
            return amount;
        }

        String getCurrency() {
            return currency;
        }
    }
}
