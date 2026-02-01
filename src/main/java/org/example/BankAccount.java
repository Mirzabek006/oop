package org.example;

abstract class BankAccount {
    protected String owner;
    protected double balance;
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    abstract void withdraw(double amount);
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited");
    }
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
