package com.acme.banking.dbo.spring.service;

import com.acme.banking.dbo.spring.dao.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class ReportingService {
    @Autowired(required = false)
    private ICurrencyService currencyService;

    @Resource
    /** Like @Autowired but with JNDI support */
    private IAccountRepository accountRepository;

    @PostConstruct
    public void onCreate() {
        System.out.println("ReportingService created");
    }

    @PreDestroy
    public void onShutDown() {
        System.out.println("ReportingService shut down");
    }

    public double getUsdAmountFor(long accountId) {
        double rurAmount = accountRepository.findById(accountId).get().getAmount();
        return currencyService.getUsdRateForRur() * rurAmount;
    }

//    Collection<Account> getAllAccountsInUsd() {
//        Collection<Account> acc = repo.getAllAccounts();
//        acc.forEach(a->a.setAmount(a.getAmount()/ xchangeService.getRateInUSD()));
//        return acc;
//    }
}
