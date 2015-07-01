/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaSelfExecise;

import java.util.Arrays;

/**
 *
 * @author segun
 * Java Array
 * http://www.homeandlearn.co.uk/java/arrays_and_strings.html
 */
public class ArrayExecises {
    
    public void arysExe1() {
        int[] aryNums = new int[6];
        int sumAry = 0;
        
        aryNums[0] = 23;
        aryNums[1] = 6;
        aryNums[2] = 47;
        aryNums[3] = 35;
        aryNums[4] = 2;
        aryNums[5] = 14;
        
        for (int i: aryNums) {
            
            sumAry = sumAry + aryNums[i];
        }
         System.out.println(sumAry/aryNums.length);
        //System.out.println(aryNums);
    }
    
     public void arysExe2() {
        int[] aryNums = new int[6];
        
        aryNums[0] = 23;
        aryNums[1] = 6;
        aryNums[2] = 47;
        aryNums[3] = 35;
        aryNums[4] = 2;
        aryNums[5] = 14;
        
        Arrays.sort(aryNums);
        
        for (int i = 0; i < aryNums.length; i = i + 1) {
            
            System.out.println(aryNums[]);
        }
         //System.out.println();
        //System.out.println(aryNums);
    }
    
    public static void main(String args[]) {
        ArrayExecises aryEx = new ArrayExecises();
        
        //aryEx.arysExe1();
        aryEx.arysExe2();
    }
}
