package com.acme.banking.dbo.ooad.repository;

import com.acme.banking.dbo.ooad.account.Account;
import com.acme.banking.dbo.ooad.account.CheckingAccount;
import com.acme.banking.dbo.ooad.account.SavingAccount;

import java.util.ArrayList;
import java.util.Collection;

public class StubAccountRepository implements IAccountRepository {
    private Collection<Account> accounts = new ArrayList<>();

    public StubAccountRepository() {
        // add 2 SavingAccount and 3 CheckingAccount
        this.addAccount(new SavingAccount());
        this.addAccount(new SavingAccount());

        this.addAccount(new CheckingAccount(100.0));
        this.addAccount(new CheckingAccount(1000.0));
        this.addAccount(new CheckingAccount(567.0));
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public Collection<Account> getAllAccounts() {
        return accounts;
    }
}
