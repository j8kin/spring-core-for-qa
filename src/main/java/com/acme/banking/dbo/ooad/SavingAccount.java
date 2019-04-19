package com.acme.banking.dbo.ooad;

public class SavingAccount extends Account {

    @Override
    void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    @Override
    double getAmount() {
        return this.amount;
    }
}
