package com.marcio.springsecuritybasicsec4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccounts")
    public String accountDetails(){
        return "Here is my Accounts details from DB";
    }
}
