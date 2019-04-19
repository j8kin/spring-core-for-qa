package com.acme.banking.dbo.ooad;

import java.util.Collection;

public interface IAccountRepository {
    Collection<Account> getAllAccounts();
}
