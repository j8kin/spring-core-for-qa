package com.acme.banking.dbo.ooad.account;

public class CheckingAccount extends Account {
    CheckingAccount(double overdraft) {
        this.overdraft = overdraft;
    }
}
