package com.chamila.java.bank;

public class CreditAccount extends Account {

    boolean validateAccount(String accountNumber) {

        try {
            if (accountWithdrawValidation()) {
                if (accountNumber.length() > 5)
                    return true;
                throw new IllegalArgumentException("Account number should length over 5 digits");


            } else {
                return false;
            }

        } catch (AccountException ae) {
            throw new IllegalArgumentException("withdraw count validation failed", ae);

        }
    }
}

