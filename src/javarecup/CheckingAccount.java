/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

import java.io.*;
/**
 *
 * @author segun
 */
public class CheckingAccount {
    private double balance;
    private int number;
    
    public CheckingAccount(int number) {
        this.number = number;
    }
    
    public void deposit(double deposit) {
        //balance = balance + deposit;
        balance += deposit;
    }
    
    public void withdraw(double withdraw) throws InsufficientFundsException {
        
        if (withdraw <= balance) {
            //balance = balance - withdraw;
            balance -= withdraw;
        } else {
            double needs = withdraw - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getNumber() {
        return number;
    }
}
