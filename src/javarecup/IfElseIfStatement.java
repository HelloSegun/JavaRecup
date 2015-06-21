/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Decision Making
 * http://www.tutorialspoint.com/java/java_decision_making.htm
 */
public class IfElseIfStatement {
    
    public static void main(String args[]) {
        int z = 100;
        
        if (z == 10) {
            System.out.println("z is " +10+ "not 100");
        }else if (z == 50) {
            System.out.println("z is " +50+ "not 100");
        }else if (z == 100) {
            System.out.println("z is " +z);
        }else{
            System.out.println("z is not an integar");
        }
    }
}
