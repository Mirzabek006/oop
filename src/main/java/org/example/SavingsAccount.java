package org.example;

public class SavingsAccount extends BankAccount {

   public  SavingsAccount(String owner, double balance) {
       super(owner, balance);
   }

    @Override
    void withdraw(double amount) {
       if (amount <= balance) {
           balance -= amount;
           System.out.println("so'm yechildi"+amount);
       }else {
           System.out.println("Yetarlicha mablag' yo'q");
       }

    }
}
