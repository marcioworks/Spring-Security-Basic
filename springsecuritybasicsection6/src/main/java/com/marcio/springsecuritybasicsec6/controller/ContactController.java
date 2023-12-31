package com.marcio.springsecuritybasicsec6.controller;

import com.marcio.springsecuritybasicsec6.model.Contact;
import com.marcio.springsecuritybasicsec6.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping("/contact")
    public Contact saveContactInquiryDetails(@RequestBody Contact contact){
        contact.setContactId(getServiceReqNumber());
        contact.setCreateAt(new Date(System.currentTimeMillis()));
        return repository.save(contact);
    }

    public String getServiceReqNumber(){
        Random random = new Random();
        int ranNumber = random.nextInt(999999999-9999)+9999;
        return "SR"+ranNumber;
    }
}
