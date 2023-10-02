package com.marcio.springsecuritybasicsec5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/myCards")
    public String cardsDetails(){
        return "Here is my Cards details from DB";
    }
}
