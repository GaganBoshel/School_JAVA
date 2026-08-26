// Write a java program in java to demonstrate the working of a banking system where we deposit and withdraw amount from our account.
// Creating an Account class which has deposit () and withdraw () methods. Take amount from the user.

import java.util.Scanner;
class Account {
    private double balance = 0;
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | Current Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " | Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        System.out.print("Enter amount to deposit: ");
        acc.deposit(sc.nextDouble());
        System.out.print("Enter amount to withdraw: ");
        acc.withdraw(sc.nextDouble());
        sc.close();
    }
}
