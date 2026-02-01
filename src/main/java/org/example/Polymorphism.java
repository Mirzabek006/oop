package org.example;

public class Polymorphism {
    public static void main(String[] args) {
        BankAccount acc1=new SavingsAccount("Ali",1000);
        BankAccount acc2= new CreditAccount("Vali",500);
        acc1.withdraw(500);
        acc2.withdraw(300);
        acc1.showBalance();
        System.out.println("--------");
        acc2.withdraw(1000);
        acc2.showBalance();
    }
}
