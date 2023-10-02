package com.marcio.springsecuritybasicsec6.controller;

import com.marcio.springsecuritybasicsec6.model.Loans;
import com.marcio.springsecuritybasicsec6.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoansRepository repository;

    @GetMapping("/myLoans")
    public List<Loans> loansDetails(@RequestParam int id) {
        return repository.findByCustomerIdOrderByStartDtDesc(id);
    }
}
