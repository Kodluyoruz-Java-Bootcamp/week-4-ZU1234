package com.bank.bank.service;

import com.bank.bank.request.PaymentRequest;
import com.bank.bank.model.CreditCard;
import com.bank.bank.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class CreditCardService {
    @Autowired
    private CreditCardRepository creditCardRepository;
    public void saveRequest(CreditCard creditCard) {
        creditCardRepository.save(creditCard);
    }

    public Boolean isPayment(PaymentRequest paymentRequest) {
        CreditCard creditCard = creditCardRepository.findById(paymentRequest.getCardNo()).orElse(null);


        boolean isCardByUser;
        boolean isBalance;

        if (creditCard != null) {
            isCardByUser = Objects.equals(paymentRequest.getUserId(), creditCard.getUserId()) && Objects.equals(paymentRequest.getCvv(), creditCard.getCvv());
            isBalance = paymentRequest.getPrice() <= creditCard.getBalance();
                     //kart bilgierini ve bakiye miktarı kontrolu yapıyoruz.
            if (isBalance && isCardByUser) {
                creditCard.setBalance(creditCard.getBalance()-paymentRequest.getPrice());
                //kart bakiyesi güncellenir.
                creditCardRepository.save(creditCard);
                return true;
            }
        }
        return false;
    }


    public List<CreditCard> findAll() {
        return creditCardRepository.findAll();
    }
}
