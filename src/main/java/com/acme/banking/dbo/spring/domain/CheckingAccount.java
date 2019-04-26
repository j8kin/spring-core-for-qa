package com.acme.banking.dbo.spring.domain;

public class CheckingAccount extends Account {
    public CheckingAccount(double overdraft) {
        this.overdraft = overdraft;
    }
}
