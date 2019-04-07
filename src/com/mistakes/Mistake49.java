package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake49 {

    public static void main(String[] args) {
        Money uah2 = new Money(300.00, "UAH");
        Bank alphaBank = new Bank("Alpha");
        Owner kolya = new Owner("Kolya");
        Bank gammaBank = new Bank("Gamma");
        Money uah = new Money(1000.00, "UAH");
        Owner petya = new Owner("Petya");
        Owner vasya = new Owner("Vasya");
        Account account3 = new Account(petya, uah2);
        Money uah1 = new Money(200.00, "UAH");
        Account account1 = new Account(vasya, uah);
        Bank betaBank = new Bank("Beta");
        betaBank.addAccount(account3);
        Owner vika = new Owner("Vika");
        gammaBank.addAccount(account1);
        Account account2 = new Account(kolya, uah1);
        Money uah3 = new Money(7000.00, "UAH");
        alphaBank.addAccount(account2);
        Account account4 = new Account(vika, uah3);
        betaBank.addAccount(account4);

        if (alphaBank.getAccountByOwnerName("Vika").getMoney().getAmount() != 7000.00) {
            throw new RuntimeException("Где деньги Вика?");
        }

        if (alphaBank.getAccountByOwnerName("Vasya").getMoney().getAmount() != 1000.00) {
            throw new RuntimeException("Где деньги Вася?");
        }

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
