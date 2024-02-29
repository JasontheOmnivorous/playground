package bankAccount;

import java.util.Scanner;

public class BankAccount {
    private int balance = 0;

    public int deposit(int sum) {
        this.balance += sum;
        return this.balance;
    }

    public int withdraw(int sum) {
        if (sum > this.balance) {
            System.out.println("Insufficient funds. Withdrawal canceled.");
            return -1;
        } else {
            this.balance -= sum;
            return this.balance;
        }
    }

    public int getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("Welcome to our bank! How can we help you?");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please enter the amount to deposit:");
                int amount = sc.nextInt();
                int newBalanceAfterDeposit = bankAccount.deposit(amount);
                System.out.println("Deposit successful. Your new balance is " + newBalanceAfterDeposit);
                break;
            case 2:
                System.out.println("Please enter the amount to withdraw:");
                int withdrawAmount = sc.nextInt();
                int newBalanceAfterWithdrawal = bankAccount.withdraw(withdrawAmount);
                if (newBalanceAfterWithdrawal != -1) {
                    System.out.println("Withdrawal successful. Your new balance is " + newBalanceAfterWithdrawal);
                }
                break;
            case 3:
                System.out.println("Your current balance is " + bankAccount.getBalance());
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }

        sc.close();
    }
}
