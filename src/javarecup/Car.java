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
Class Vehicle {} //The class will not run due to error - this error is on purpose

public class Car extends Vehicle {
    
    public static void main(String args[]) {
        Vehicle a = new Car;
        //( Object reference variable ) instanceof  (class/interface type)
        // following will return true since name is type of String
        boolean result = a instanceof Car;
        System.out.print(result);
    }
}
