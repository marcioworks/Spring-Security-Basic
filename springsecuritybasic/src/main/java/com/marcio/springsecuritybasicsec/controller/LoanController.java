package com.marcio.springsecuritybasicsec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/myLoans")
    public String loansDetails(){
        return "Here is my Loans details from DB";
    }
}
