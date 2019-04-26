package com.acme.banking.dbo.spring;

import com.acme.banking.dbo.spring.dao.IAccountRepository;
import com.acme.banking.dbo.spring.domain.Account;
import com.acme.banking.dbo.spring.domain.SavingAccount;
import com.acme.banking.dbo.spring.service.ICurrencyService;
import com.acme.banking.dbo.spring.service.ReportingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:test-spring-context.xml", "classpath:spring-context.xml"})
@ActiveProfiles({"test","system-test"})
@TestPropertySource("classpath:app.properties")
@Transactional
public class TestApp {
    @Autowired
    private ReportingService reportingService;
    @MockBean
    private IAccountRepository accountRepository;
    @Autowired
    ApplicationContext context;

    @Profile("test")
    @Configuration
    @ImportResource({"classpath:test-spring-context.xml", "classpath:spring-context.xml"})
    public static class TestConfig {
        @Bean
        public ReportingService reportingService() {
        }
    }

    @Test
    public void Test1() {
        ICurrencyService currencyService = mock(ICurrencyService.class);
        when(currencyService.getUsdRateForRur()).thenReturn(30d);

        Account accountStub = mock(SavingAccount.class);
        when(accountStub.getAmount()).thenReturn(10_000d);
        when(accountRepository.findById(1L)).thenReturn(Optional.of(accountStub));

        assertThat(reportingService.getUsdAmountFor(0L)).isEqualTo(10_000d);


//        ReportingService reportingService = new ReportingService(
//                new NostalgicExchangeService(30),
//                accountRepository
//        );

//        Collection<Account> accounts = reportingService.getAllAccountsInUsd();
//
//        accounts.forEach(account -> System.out.println(account.getOverdraft()));
    }
}
