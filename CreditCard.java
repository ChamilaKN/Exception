package com.chamila.java.bank;

import java.io.InvalidObjectException;

public class CreditCard extends VisaCard {
    @Override
    public void withdraw(Double amount){

        try {
            if(validateCardNumber("8126 ")){
                super.withdraw(amount);
            }
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        } catch (CreditAccountException e) {
            e.printStackTrace();
        } catch (AccountException ae){
            ae.printStackTrace();
        }
    }

}
