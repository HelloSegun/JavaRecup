/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaSelfExecise;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author segun
 */
public class RandomLotteryNum {
    
    /*
    Random rand = new Random();
    
    public RandomLotteryNum() {
        
    }
    
    public void xRand(int[] num) {
        for (int i = 1; i < num[50];)
            for (int j = )
    }
    */
    
    public static void main(String args[]) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 49; i++)
            al.add(i);
        Random ran = new Random();
        
        for (int i = 0; i < 6; i++) {
            int x = al.remove(ran.nextInt(al.size()));
            System.out.print(" " + x);
        }
        System.out.println();
    } 
}
