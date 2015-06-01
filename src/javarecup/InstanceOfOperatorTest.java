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
public class InstanceOfOperatorTest {
    
    public static void main(String args[]) {
        String name = "James";
        //( Object reference variable ) instanceof  (class/interface type)
        // following will return true since name is type of String
        Boolean result = name instanceof String;
        System.out.println(result);
    }
}
