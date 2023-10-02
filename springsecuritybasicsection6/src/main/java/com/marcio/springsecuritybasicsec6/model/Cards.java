package com.marcio.springsecuritybasicsec6.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native")
    @Column(name="card_id")
    private int cardId;
    @Column(name="card_number")
    private String cardNumber;
    @Column(name="customer_id")
    private long customerId;
    @Column(name="card_type")
    private String cardType;
    @Column(name="total_limit")
    private int totalLimit;
    @Column(name="amount_used")
    private int amount_used;
    @Column(name="available_amount")
    private int availableAmount;
    @Column(name="create_at")
    @CreationTimestamp
    private String createAt;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(int totalLimit) {
        this.totalLimit = totalLimit;
    }

    public int getAmount_used() {
        return amount_used;
    }

    public void setAmount_used(int amount_used) {
        this.amount_used = amount_used;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
