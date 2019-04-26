package com.acme.banking.dbo.spring.dao;

import com.acme.banking.dbo.ooad.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository  extends JpaRepository<Account, Long> {

}
