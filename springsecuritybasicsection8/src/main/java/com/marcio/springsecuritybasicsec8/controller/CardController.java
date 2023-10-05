package com.marcio.springsecuritybasicsec7.controller;

import com.marcio.springsecuritybasicsec7.model.Cards;
import com.marcio.springsecuritybasicsec7.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardsRepository repository;

    @GetMapping("/myCards")
    public List<Cards> getCards(@RequestParam int id){
        return repository.findByCustomerId(id);
    }
}
