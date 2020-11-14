package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000.00);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current balance: " + bankAccount.getAmount());
            System.out.println("Еnter the amount: ");
            int reqstdAmount = scanner.nextInt();
            try {
                bankAccount.withDraw(reqstdAmount);
            } catch (LimitException e) {
                System.out.println(e.getMessage() + e.getRemainingAmount());
                break;
            }
        }
    }
}
