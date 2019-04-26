package com.acme.banking.dbo.spring_orig.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
public class SavingAccount extends Account {
    public SavingAccount() {
    }

    public SavingAccount(double amount, String email) {
        super(amount, email);
    }
}
