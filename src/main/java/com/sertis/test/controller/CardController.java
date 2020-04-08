package com.sertis.test.controller;


import com.sertis.test.model.CardObj;
import com.sertis.test.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("/add/card")
    public void addNewCard(CardObj cardObj) {
        cardService.addNewCard(cardObj);
    }

    @PostMapping("/edit/card")
    public void editCard(CardObj cardObj) {
        cardService.editCard(cardObj);
    }

    @GetMapping("/delete/card/{cardId}")
    public void deleteCard(@PathVariable String cardId) {
        cardService.deleteCard(cardId);
    }

}
