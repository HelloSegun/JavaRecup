/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 */
public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        double d_amount = 500.00;
        System.out.println("Depositing £" + d_amount + "...");
        c.deposit(d_amount);
        try {
            double w_amount = 100;
            System.out.println("\nWithdrawing £" +w_amount + "...");
            c.withdraw(w_amount);
            w_amount = 600;
            System.out.println("\nWithdrawing £" + w_amount + "...");
            c.withdraw(w_amount);
        }catch(InsufficientFundsException e){
            System.out.println("Sorry, but you are short £" + e.getAmount());
            e.printStackTrace();
        }
    }
}
