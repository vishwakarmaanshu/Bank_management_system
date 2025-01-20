package com.java.banking_system.service;

import java.util.List;

import com.java.banking_system.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    
    
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id,double amount);
    AccountDto withdraw(Long id,double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);
}
