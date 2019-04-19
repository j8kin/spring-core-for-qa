package com.acme.banking.dbo.ooad.repository;

import com.acme.banking.dbo.ooad.account.Account;

import java.util.Collection;

public interface IAccountRepository {
    Collection<Account> getAllAccounts();
}
