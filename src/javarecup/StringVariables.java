/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Accepting Input from a User
 * http://www.homeandlearn.co.uk/java/user_input.html
 */
import java.util.Scanner;

public class StringVariables {
    
    public static void main(String args[]) {
        
        Scanner input_user = new Scanner(System.in);
         
        String first_name;              
        System.out.print("Enter your first name: ");
        first_name = input_user.next();
        
        String last_name;
        System.out.print("Enter your last name: ");
        last_name = input_user.next();
        
        String full_name = first_name +" "+ last_name;
        System.out.println("Your full name is: "+full_name);
    }
}
