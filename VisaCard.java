package com.chamila.java.bank;

import java.io.InvalidObjectException;

public class VisaCard extends CreditAccount {
    @Override
    public void withdraw(Double amount) {
        System.out.println("withdraw made to double account class");

    }


    public boolean validateCardNumber(String cardNumber) throws InvalidObjectException, CreditAccountException {
try{
        if (validateAccount(cardNumber)) {


            if (cardNumber.startsWith("812"))
                return true;
            throw new InvalidObjectException("Invalid Card Number");
        }
        else{
            throw new CreditAccountException("Invalid Account Number");



        }
    }catch (IllegalArgumentException iae){
        throw new AccountException("Account Validation Failed",iae);
    }
    }
}


