package com.emlakcepte.client.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcards")
public class CreditCard {
    @Id
    @Column(name = "card_no")
    private String cardNo;
    @Column(name = "cvv")
    private int cvv;
    @Column(name = "user_id")
    private int user_Id;  // kart sahibi
    @Column(name = "balance")
    private double balance; //bakiye


    public CreditCard() {
    }

    public CreditCard(String cardNo, int cvv, int user_Id, double balance) {
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.user_Id = user_Id;
        this.balance = balance;
    }


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
