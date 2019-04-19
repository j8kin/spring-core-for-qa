package com.acme.banking.dbo.ooad;

import java.util.Collection;

public class FrameworkApp {
    public static void main(String[] args) {
        ReportingService reportingService = new ReportingService(
                new NostalgicExchangeService(30),
                new AccountRepository()
        );

        Collection<Account> accounts = reportingService.getAllAccountsInUsd();

        accounts.forEach(account -> System.out.println(account.getOverdraft()));
    }
}
