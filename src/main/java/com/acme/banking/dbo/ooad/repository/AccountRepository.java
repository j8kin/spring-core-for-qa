package com.acme.banking.dbo.ooad.repository;

import com.acme.banking.dbo.ooad.account.Account;

import java.util.ArrayList;
import java.util.Collection;

public class AccountRepository implements IAccountRepository {
    private Collection<Account> accounts = new ArrayList<>();
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public Collection<Account> getAllAccounts() {
        return accounts;
    }
}
