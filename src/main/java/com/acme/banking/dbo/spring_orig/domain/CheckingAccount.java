package com.acme.banking.dbo.spring_orig.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount() {
    }

    public CheckingAccount(double amount, double overdraft, String email) {
        super(amount, email);
        this.overdraft = overdraft;
    }
}
