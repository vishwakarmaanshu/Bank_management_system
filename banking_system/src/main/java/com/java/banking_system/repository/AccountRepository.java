package com.java.banking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.banking_system.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
