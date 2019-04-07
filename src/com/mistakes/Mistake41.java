package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake41 {

    public static void main(String[] args) {
        Bank bank = new Bank("Alpha");
        Owner vasya = new Owner("Vasya");
        Money money = new Money(100.50, "UAH");
        Account account = new Account(vasya, money);

        bank.addAccount(account);
        System.out.println(money.getAmount());
    }

    static class Bank {
        private String name;
        private Account[] accounts;

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
            accounts[accounts.length + 1] = account;
        }
    }

    static class Account {
        private Owner owner;
        private Money money;

        Account(Owner owner, Money money) {
            this.owner = owner;
            this.money = money;
        }
    }

    static class Owner {
        private String name;

        Owner(String name) {
            this.name = name;
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
