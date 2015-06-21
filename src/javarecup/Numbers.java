/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Numbers
 * http://www.tutorialspoint.com/java/number_xxxvalue.htm
 */
public class Numbers {
    
    
    
    //Java - xxxValue() Method
    public void xxxValue() {
        Integer x = 5;
        System.out.println(x.byteValue());
        System.out.println(x.shortValue());
        System.out.println(x.doubleValue());
        System.out.println(x.floatValue());
        System.out.println(x.intValue());
    }
    
    //Java - compareTo() Method
    public void xCompareTo() {
        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));
    }
    
    //Java - equals() Method
    public void xEquals() {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a = 5;
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));
    }
    
    public void xValueOf() {
        Integer x = Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80"); //turns a string into float number
        
        /**
         * turns a string into integer number then parse as hexadecimal
         * 444 parsed to 16
         * (4*16sq2)+(4*16sq1)+(4*1)
         * (4*256)+(4*16)+(4)
         * 1024 + 64 + 4
         * 1092
         */
        Integer b = Integer.valueOf("444", 16);
        
        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String args[]) {
        
        Numbers number = new Numbers();
        //number.xxxValue();
        //number.xCompareTo();
        //number.xEquals();
        number.xValueOf();
    }
}
