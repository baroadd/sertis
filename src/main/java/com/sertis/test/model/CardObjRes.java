package com.sertis.test.model;

public class CardObjRes {
    public  CardObjRes () {}
    public CardObjRes(String cardId, String name, String status, String content, String category, String author, String responseCode, String errDesc) {
        this.cardId = cardId;
        this.name = name;
        this.status = status;
        this.content = content;
        this.category = category;
        this.author = author;
        this.responseCode = responseCode;
        this.errDesc = errDesc;
    }

    private String cardId;
    private String name;
    private String status;
    private String content;
    private String category;
    private String author;
    private String responseCode;
    private String errDesc;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }
}
