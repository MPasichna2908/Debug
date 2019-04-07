package com.mistakes;

/**
 * здесь одна ошибка
 */
public class Mistake47 {

    public static void main(String[] args) {
        Bank alphaBank = new Bank("Alpha");
        Money uah = new Money(1000.00, "UAH");
        Money uah2 = new Money(300.00, "UAH");
        Money uah1 = new Money(200.00, "UAH");
        uah2.addMoney(100.00);
        Owner kolya = new Owner("Kolya");
        Owner vasya = new Owner("Vasya");
        Money uah3 = new Money(7000.00, "UAH");
        uah3.addMoney(1000.00);
        Account account1 = new Account(vasya, uah);
        alphaBank.addAccount(account1);
        Account account2 = new Account(kolya, uah1);
        alphaBank.addAccount(account2);
        Owner petya = new Owner("Petya");
        Account account3 = new Account(petya, uah2);
        Owner vika = new Owner("Vika");
        alphaBank.addAccount(account3);
        Account account4 = new Account(vika, uah3);
        alphaBank.addAccount(account4);
        uah2.addMoney(200.00);

        //это кусок кода менять нельзя -----------------------------------
        if (alphaBank.getAccountByOwnerName("Petya").getMoney().getAmount() != 600.00) {
            throw new RuntimeException("Где деньги Петя?");
        }

        if (alphaBank.getAccountByOwnerName("Vika").getMoney().getAmount() != 8000.00) {
            throw new RuntimeException("Где деньги Вика?");
        }
        //----------------------------------------------------------------

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

            return null;
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
            this.amount = amount;
            this.currency = currency;
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
