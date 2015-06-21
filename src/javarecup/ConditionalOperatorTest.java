/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Basic Operators
 * http://www.tutorialspoint.com/java/java_basic_operators.htm
 */
public class ConditionalOperatorTest {
    
    public static void main(String args[]) {
        int a, b;
        a = 10;
        //variable x = (expression) ? value if true : value if false
        b = (a == 1) ? 20: 30;
        System.out.println("Value of b is: " + b);
        
        //variable x = (expression) ? value if true : value if false
        b = (a == 10) ? 20: 30;
        System.out.println("Value of b is: " + b);
    }
}
