package com.mistakes;

/**
 * здесь несколько ошибок
 */
public class Mistake46 {

    public static void main(String[] args) {
        Bank alphaBank = new Bank("Alpha");
        Money uah = new Money(1000.00, "UAH");
        Owner vasya = new Owner("Vasya");
        Account account1 = new Account(vasya, uah);
        Money uah1 = new Money(200.00, "UAH");
        Owner kolya = new Owner("Kolya");
        alphaBank.addAccount(account1);
        Account account2 = new Account(kolya, uah1);
        alphaBank.addAccount(account2);
        account1.setMoney(account2.getMoney());
        Owner petya = new Owner("Petya");
        Owner vika = new Owner("Vika");
        Money uah3 = new Money(7000.00, "UAH");
        Money uah2 = new Money(300.00, "UAH");
        uah3.setAmount(uah1.getAmount());
        Account account3 = new Account(petya, uah2);
        account3.setMoney(account1.getMoney());
        alphaBank.addAccount(account3);
        Account account4 = new Account(vika, uah3);
        alphaBank.addAccount(account4);

        //это кусок кода менять нельзя найдите ошибки в других местах ----
        if (alphaBank.getAccountByOwnerName("Vasya").getMoney().getAmount() != 1000.00) {
            throw new RuntimeException("Где деньги Вася?");
        }

        if (alphaBank.getAccountByOwnerName("Vika").getMoney().getAmount() != 7000.00) {
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

        void setAmount(double amount) {
            this.amount = amount;
        }

        void setCurrency(String currency) {
            this.currency = currency;
        }
    }
}
