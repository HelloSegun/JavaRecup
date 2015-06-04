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
Class Vehicle {} //The class will not run due to error - this error is on purpose

public class InstanceOfOperatorTestCar extends Vehicle {
    public static void main(String args[]) {
        Vehicle a = new InstanceOfOperatorTestCar;
        //( Object reference variable ) instanceof  (class/interface type)
        // following will return true since name is type of String
        boolean result = a instanceof InstanceOfOperatorTestCar;
        System.out.print(result);
        
        
    }
}
