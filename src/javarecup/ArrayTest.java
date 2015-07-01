/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

import java.util.Arrays;

/**
 *
 * @author segun
 * Java_Array
 * http://www.homeandlearn.co.uk/java/java_arrays.html
 */
public class ArrayTest {
    
    public void aryNumbers() {
        
        int[] aryNums;
        aryNums = new int[6];
        
        aryNums[0] = 10;
        aryNums[1] = 12;
        aryNums[2] = 36;
        aryNums[3] = 38;
        aryNums[4] = 50;
        aryNums[5] = 65;
        
        System.out.println(aryNums[5]);
    }
    
    public void aryLoop() {
        
        int[] aryNums = new int[49];
        for(int i = 0; i < aryNums.length; i = i + 1) {
            aryNums[i] = i + 1;
            
            System.out.println(aryNums[i]);
            //System.out.print(aryNums[i]+ ",");
        }
    }
    
    public void arySort() {
        int[] aryNums = new int[6];
        
        aryNums[0] = 10;
        aryNums[1] = 14;
        aryNums[2] = 36;
        aryNums[3] = 27;
        aryNums[4] = 43;
        aryNums[5] = 18;
        
        Arrays.sort(aryNums);
        
        for (int i = 0; i < aryNums.length; i = i + 1) {
            
            System.out.println(aryNums[i]);
        }
    }
    
    public void aryStr() {
        String[] aryString = new String[6];
        
        aryString[0] = "This";
        aryString[1] = "is";
        aryString[2] = "a";
        aryString[3] = "string";
        aryString[4] = "srray";
        aryString[5] =".";
        
        for (int i = 0; i < aryString.length; i = i + 1) {
            
            System.out.println(aryString[i]);
        }
    } 
    
     public void aryStrSort() {
        String[] aryString = new String[5];
        
        aryString[0] = "this";
        aryString[1] = "is";
        aryString[2] = "a";
        aryString[3] = "string";
        aryString[4] = "array";
        
        Arrays.sort(aryString);
        for (int i = 0; i < aryString.length; i = i + 1) {
            
            System.out.println(aryString[i]);
        }
    } 
    
    public static void main(String args[]) {
        
       ArrayTest aryTest = new ArrayTest();
       
       //aryTest.aryNumbers();
       //aryTest.aryLoop();
       //aryTest.arySort();
       //aryTest.aryStr();
       aryTest.aryStrSort();
    }
}
