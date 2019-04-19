package com.acme.banking.dbo.ooad;

import com.acme.banking.dbo.ooad.account.Account;
import com.acme.banking.dbo.ooad.repository.IAccountRepository;
import com.acme.banking.dbo.ooad.xService.XchangeService;

import java.util.Collection;

class ReportingService {
    private IAccountRepository repo;
    private XchangeService xchangeService;

    ReportingService(XchangeService xchangeService, IAccountRepository repo) {
        this.xchangeService = xchangeService;
        this.repo = repo;
    }

    Collection<Account> getAllAccountsInUsd() {
        Collection<Account> acc = repo.getAllAccounts();
        acc.forEach(a->a.setAmount(a.getAmount()/ xchangeService.getRate()));
        return acc;
    }
}
