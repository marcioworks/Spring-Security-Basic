package com.marcio.springsecuritybasicsec7.controller;

import com.marcio.springsecuritybasicsec7.model.AccountTransactions;
import com.marcio.springsecuritybasicsec7.repository.AccountTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    @Autowired
    private AccountTransactionsRepository repository;

    @GetMapping("/myBalance")
    public List<AccountTransactions> getBalanceDetails(@RequestParam int id){
        return repository.findByCustomerIdOrderByTransactionDtDesc(id);
    }
}
