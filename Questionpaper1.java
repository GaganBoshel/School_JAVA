import java.util.Scanner;

class Account {
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: Rs. " + balance);
    }
}

public class Questionpaper1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
        account.displayBalance();

        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayBalance();
    }
}