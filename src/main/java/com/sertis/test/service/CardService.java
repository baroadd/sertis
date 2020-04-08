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
        try {
           CardObj resCardObj = cardDAO.insertCard(cardObj);
           return cardObjtoCardObjRes(resCardObj);
        }catch (Exception e) {
            return errorRes(e);
        }
    }

    public CardObjRes editCard(CardObj cardObj) {
        try {
            CardObj resCardObj = cardDAO.editCard(cardObj);
            return cardObjtoCardObjRes(resCardObj);
        }catch (Exception e) {
            return errorRes(e);
        }
    }

    public String deleteCard(String cardId) {
        try {
            String resCardId = cardDAO.deleteCard(cardId);
            return resCardId;
        } catch (Exception e) {
            return "Can't Delete";
        }
    }

    private CardObjRes cardObjtoCardObjRes(CardObj cardObj) {
        String pass = "00";
        return new CardObjRes(cardObj.getCardId(), cardObj.getName(), cardObj.getStatus(), cardObj.getContent(), cardObj.getCategory(), cardObj.getAuthor(),pass,null);
    }

    private CardObjRes errorRes(Exception e) {
        CardObjRes resErr = new CardObjRes();
        resErr.setResponseCode("10");
        resErr.setErrDesc(e.getMessage());
        return resErr;
    }
}
