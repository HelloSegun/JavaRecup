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
public class EnhancedForLoopBreakContinue {
    
    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};
        int [] nums = {100, 200, 300, 400, 500};
        
        for (int x: numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x + ",");
  
        }
        
        System.out.println("\n");
        for (int y: nums) {
            if (y == 300 ) {
                continue;
            }
            System.out.print(y + ",");
        }
    }
}
