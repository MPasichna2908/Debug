package com.mistakes;

/**
 * здесь одна ошибка
 */
public class Mistake50 {

    public static void main(String[] args) {
        Bank alphaBank = new Bank("Alpha");
        Money uah = new Money(1000.00, "UAH");
        Owner vika = new Owner("Vika");
        Money uah1 = new Money(200.00, "UAH");
        Owner kolya = new Owner("Kolya");
        Money uah3 = new Money(300.00, "UAH");
        Account account2 = new Account(kolya, uah1);
        alphaBank.addAccount(account2);
        Owner kiril = new Owner("Petya");
        Account account4 = new Account(vika, uah3);
        alphaBank.addAccount(account4);
        Money uah2 = new Money(200.00, "UAH");
        Owner vanya = new Owner("Vanya");
        Account account3 = new Account(kiril, uah2);
        alphaBank.addAccount(account3);
        Account account1 = new Account(vanya, uah);
        alphaBank.addAccount(account1);

        //это кусок кода менять нельзя ----------------------------------
        if (alphaBank.getAccountByOwnerName("Vika").getMoney().getAmount() != 300.00) {
            throw new RuntimeException("Где деньги Вика?");
        }

        if (alphaBank.getAccountByOwnerName("Kolya").getMoney().getAmount() != 200.00) {
            throw new RuntimeException("Где деньги Коля?");
        }
        //---------------------------------------------------------------

        System.out.println("деньги на месте");
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

        Account getAccountByOwnerName(String ownerName) {
            for (int i = 0; i < numberOfAccounts; i++) {
                if (accounts[i].getOwner().getName().equals(ownerName)) {
                    return accounts[i];
                }
            }

            return new Account(new Owner(""), new Money(0, "UAH"));
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

        void setOwner(Owner owner) {
            this.owner = owner;
        }

        void setMoney(Money money) {
            this.money = money;
        }
    }

    static class Owner {
        private String name;

        Owner(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }

    static class Money {
        private double amount;
        private String currency;

        Money(double amount, String currency) {
            amount = amount;
            currency = currency;
        }

        double getAmount() {
            return amount;
        }

        String getCurrency() {
            return currency;
        }

        void addMoney(double amount) {
            this.amount = amount;
        }

        void setAmount(double amount) {
            this.amount = amount;
        }

        void setCurrency(String currency) {
            this.currency = currency;
        }
    }
}
