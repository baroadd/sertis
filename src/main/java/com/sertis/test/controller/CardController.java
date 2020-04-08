package com.sertis.test.controller;


import com.sertis.test.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @Autowired
    private CardService cardService;
    @PostMapping("/add/card")
    public void addNewCard(){

    }
}
