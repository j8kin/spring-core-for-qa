package com.acme.banking.dbo.spring.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
@DiscriminatorColumn(name="ACCOUNT_TYPE")
public abstract class Account {
    double overdraft = 0.0;
    protected double amount;

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void withdraw(double amount) {
        if (amount < this.amount + this.overdraft) {
            this.amount -= amount;
        }
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public double getOverdraft() {
        return overdraft;
    }
}
