/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rowan
 */
public class CLIENT {
    private double balance;
    private String cardno;


    public CLIENT(double balance, String cardno) {
        this.balance = balance;
        this.cardno = cardno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardno() {
        return cardno;
    }
    
    
}
