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
public class SwitchStatement {
    
    public static void main(String args[]) {
        // byte, int, char, short
        int mark = 80;
        
        switch(mark) {
            case 100:
            case 90:
            case 80:
                System.out.println("Distinction");
                break;
            case 70:
                System.out.println("1st Class");
                break;
            case 60:
                System.out.println("2nd Class Upper");
                break;
            case 50:
                System.out.println("2nd Class Lower");
                break;
            case 40:
                System.out.println("3rd Class");
                break;
            case 30:
            case 20:
            case 10:
                System.out.println("Fail");
                break;
            default :
                System.out.println("Invalid mark");   
        }
        System.out.println("Your mark is: "+mark);
    }
}
