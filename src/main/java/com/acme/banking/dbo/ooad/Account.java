package com.acme.banking.dbo.ooad;

public abstract class Account {
    double overdraft = 0.0;
    protected double amount;

    void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    double getAmount() {
        return amount;
    }

    void withdraw(double amount) {
        if (amount < this.amount + this.overdraft) {
            this.amount -= amount;
        }
    }

    void addAmount(double amount) {
        this.amount += amount;
    }

    double getOverdraft() {
        return overdraft;
    }
}
