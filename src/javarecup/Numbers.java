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
        Integer x = Integer.valueOf(9); //returns x as Integer
        Double c = Double.valueOf(5); //returns c as double
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
    
    public void xtoString() {
        Integer x = 5;
        
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
        //System.out.println(Integer.toString(444, 16));
    }
    
    public void xParseInt() {
        int x = Integer.parseInt("9"); //returns string as Integer
        double c = Double.parseDouble("5"); //returns strings as double
        
        /*
        * similar return as statement in xValueOf method
        */
        int b = Integer.parseInt("444", 16);
        
        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }
    
    public void xAbs() {
        Integer a = -8;
        double d = -100;
        float f = -90;
        
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));
    }
    
    public static void main(String args[]) {
        
        Numbers number = new Numbers();
        //number.xxxValue();
        //number.xCompareTo();
        //number.xEquals();
        //number.xValueOf();
        //number.xtoString();
        //number.xParseInt();
        number.xAbs();
    }
}
