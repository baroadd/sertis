package com.sertis.test.service;

import com.sertis.test.model.CardObj;
import com.sertis.test.model.CardObjRes;
import com.sertis.test.repository.CardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    private CardDAO cardDAO;

    public CardObjRes addNewCard(CardObj cardObj) {
        return null;
    }

    public CardObjRes editCard(CardObj cardObj) {
        return null;
    }

    public String deleteCard(String cardId) {
        return null;
    }


}
