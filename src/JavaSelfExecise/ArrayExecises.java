/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaSelfExecise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

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
            
            //System.out.println(aryNums[i]);
        }
         //System.out.println();
        System.out.println(aryNums[5]);
    }
     
     public void arysExe3() {
         int[] aryNums = new int[6];
         
         aryNums[0] = 23;
         aryNums[1] = 6;
         aryNums[2] = 47;
         aryNums[3] = 35;
         aryNums[4] = 2;
         aryNums[5] = 14;
         
         for(int i : aryNums) {
             if(i % 2 == 1) {
                 System.out.println(i);
             }
         }
     }
     
     //http://www.homeandlearn.co.uk/java/multi-dimensional_arrays.html
     public void multiDimensionalArray() {
         int rows = 6;
         int columns = 5;
         
         int[][] aryNums = new int[rows][columns];
         int i, j;
         int z = 1;
         for(i = 0; i < rows; i = i + 1) {
             
             for(j = 0; j < columns; j = j + 1) {
                 aryNums[i][j] = z;
                 System.out.print(aryNums[i][j] + " ");
             }
             z = z + 1;
             System.out.println("");
         }
     }
     
     //http://www.homeandlearn.co.uk/java/array_lists.html
     public void aryList() {
         ArrayList listTest = new ArrayList();
         
         listTest.add("first item");
         listTest.add("second item");
         listTest.add("third item");
         listTest.add(7);
         
         Iterator it = listTest.iterator();
         
         while (it.hasNext()) {
             System.out.println(it.next());
         }
         
         // REMOVE AN ITEM FROM THE LIST
         listTest.remove("second item");
         
         // PRINT OUT THE NEW LIST
         System.out.println("Whole list=" + listTest);
         
         // GET THE ITEM AT INDEX POSITION 1
         System.out.println("Position 1=" + listTest.get(1));
         
         
     }
    
    public static void main(String args[]) {
        ArrayExecises aryEx = new ArrayExecises();
        
        //aryEx.arysExe1();
        //aryEx.arysExe2();
        //aryEx.arysExe3();
        //aryEx.multiDimensionalArray();
        aryEx.aryList();
    }
}
