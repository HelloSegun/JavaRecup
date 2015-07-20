/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarecup;

/**
 *
 * @author KuyeS10
 * Java - Method
 * http://www.tutorialspoint.com/java/java_methods.htm
 */
public class ExampleMinNumber {
    
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println("Minimum Value = " + c);
        
        //My own Practice 19:58 18/07/2015
        int g = maxFunction(a, b);
        System.out.println("Maximum Value = " + g);
        
        int d = 23;
        int e = 100;
        int f = maxFunction(d, e);
        System.out.println("Maximum Value = " + f);
    }
    
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
    
    //My own Practice 19:58 18/07/2015
    
    public static int maxFunction(int n3, int n4) {
        int max;
        if (n3 > n4) {
            max = n3;
        } else {
            max = n4;
        }
        return max;
    }
}
