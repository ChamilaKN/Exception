package com.chamila.java.bank;

public class Account {

    int withdrawCount=5;

    public boolean accountWithdrawValidation(){
        if(withdrawCount<=3){
            return true;

        }else{
            throw new AccountException("withdraw count exceeded");
        }
    }
    public void withdraw(Double amount){}
}
