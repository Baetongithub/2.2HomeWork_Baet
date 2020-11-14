package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount += sum;
        return amount;
    }

    public double withDraw(int sum) throws LimitException {
        if (sum <= amount) {
            amount -= sum;

        } else if (sum > amount) {
            amount -= amount;
            throw new LimitException("Not enough funds to withdraw, " +
                    "you have automatically \nwithdrawn all remaining funds in your account. \nCurrent balance: ", amount);
        }
        return amount;
    }
}