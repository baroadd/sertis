package com.sertis.test.controller;


import com.sertis.test.model.CardObj;
import com.sertis.test.model.CardObjRes;
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
    public CardObjRes addNewCard(CardObj cardObj) {
        return cardService.addNewCard(cardObj);
    }

    @PostMapping("/edit/card")
    public CardObjRes editCard(CardObj cardObj) {
        return cardService.editCard(cardObj);
    }

    @GetMapping("/delete/card/{cardId}")
    public String deleteCard(@PathVariable String cardId) {
        return cardService.deleteCard(cardId);
    }

}
