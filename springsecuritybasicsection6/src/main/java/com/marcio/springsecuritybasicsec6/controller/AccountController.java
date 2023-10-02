package com.marcio.springsecuritybasicsec6.controller;

import com.marcio.springsecuritybasicsec6.model.Account;
import com.marcio.springsecuritybasicsec6.model.AccountTransactions;
import com.marcio.springsecuritybasicsec6.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountsRepository repository;

    @GetMapping("/myAccounts")
    public Account getAccount(@RequestParam int id) {
        return repository.findByCustomerId(id);
    }
}
