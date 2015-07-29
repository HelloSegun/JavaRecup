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
public class AbstractDemo {
    
    public static void main(String[] args) {
        SalaryAbstract s = new SalaryAbstract("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        EmployeeAbstract e = new SalaryAbstract("John Adams", "Boston, MA", 2, 2400.00);
        
        System.out.println("\n Call mailCheck using Employee reference--");
        s.mailCheck();
    
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
