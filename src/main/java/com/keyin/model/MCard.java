package com.keyin.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private double balance;
    private LocalDateTime issuedAt = LocalDateTime.now();

    // getters and setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Long getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }
}
