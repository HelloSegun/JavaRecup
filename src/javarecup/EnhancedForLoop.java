/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java Loop Control
 * http://www.tutorialspoint.com/java/java_loop_control.htm
 */
public class EnhancedForLoop {
    
    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};
        String [] names = {"James", "John", "Mark", "Peter"};
        
        for (int x: numbers){
            System.out.print(x +",");
            //System.out.print(",");
        }
        
        System.out.println("\n");
        for (String name: names) {
            System.out.print(name +",");
        }
    }
}
