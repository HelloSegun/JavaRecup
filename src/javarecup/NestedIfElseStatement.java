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
public class NestedIfElseStatement {
    
    public static void main(String args[]) {
        int x = 50;
        int y = 40;
        
        if (x == 50) {
            if (y == 40) {
                System.out.println("x is "+x+" & y is "+y);
            }else{
                System.out.println("Either x or y is correct");
            }
        }
    }
}
