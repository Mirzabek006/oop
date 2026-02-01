package org.example;

public class CreditAccount extends BankAccount {
    public CreditAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    void withdraw(double amount) {
       balance = balance - amount;
        System.out.println("so'm kredit sifatide yechiladi: " + amount);
    }
}
