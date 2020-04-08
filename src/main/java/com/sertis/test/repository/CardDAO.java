package com.sertis.test.repository;

import com.sertis.test.model.CardObj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CardDAO {
    private static Logger logger = LoggerFactory.getLogger(CardDAO.class);
    private final JdbcTemplate jdbcTemplate;

    public CardDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public CardObj insertCard(CardObj cardObj) throws Exception {
        try {
            String sql = "INSERT INTO card(cardId,name,status,content,category,author) VALUES(?,?,?,?,?,?)";
            jdbcTemplate.update(sql, cardObj.getCardId(), cardObj.getName(), cardObj.getStatus(), cardObj.getContent(), cardObj.getCategory(), cardObj.getAuthor());
            return cardObj;
        } catch (Exception e) {
            logger.error("Can't insert card to database.", e);
            throw new Exception();
        }
    }

    public CardObj editCard(CardObj cardObj) throws Exception {
        try {
            String sql = "UPDATE card SET cardId = ?,name = ?,status = ?,content = ?,category = ?,author = ? WHERE cardId = ?";
            jdbcTemplate.update(sql, cardObj.getCardId(), cardObj.getName(), cardObj.getStatus(), cardObj.getContent(), cardObj.getCategory(), cardObj.getAuthor(), cardObj.getCardId());
            return cardObj;
        } catch (Exception e) {
            logger.error("Can't edit card to database.", e);
            throw new Exception();
        }
    }

    public String deleteCard(String cardId) throws Exception {
        try {
            String sql = "DELETE FROM card WHERE cardId = ?";
            jdbcTemplate.update(sql, cardId);
            return cardId;
        } catch (Exception e) {
            logger.error("Can't delete card.", e);
            throw new Exception();
        }
    }
}
