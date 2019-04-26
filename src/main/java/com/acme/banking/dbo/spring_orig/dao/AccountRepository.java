package com.acme.banking.dbo.spring_orig.dao;

import com.acme.banking.dbo.spring_orig.domain.Account;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Profile({"prod", "system-test"})
public interface AccountRepository extends JpaRepository<Account, Long> {
}
