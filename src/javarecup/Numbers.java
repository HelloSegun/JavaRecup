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
    
    public void xCeil() {
        double d = -100.675;
        float f = -90;
        
        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));
        
        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));
    }
    
    public void xFloor() {
        double d = -100.675;
        float f = -90;
        
        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));
        
        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));
    }
    
    public void xRint() {
        double d = 100.675;
        double e = 100.500;
        double f = 100.200;
        
        System.out.println(Math.rint(d));
        System.out.println(Math.rint(e));
        System.out.println(Math.rint(f));
    }
    
    public void xRound() {
        double d = 100.675;
        double e = 100.500;
        float f = 100;
        float g = 90f;
        
        System.out.println(Math.round(d));
        System.out.println(Math.round(e));
        System.out.println(Math.round(f));
        System.out.println(Math.round(g));
    }
    
    public void xMin() {
        System.out.println(Math.min(12.123, 12.456));
        System.out.println(Math.min(23.12, 23.0));
    }
    
    public void xMax() {
        System.out.println(Math.max(12.123, 12.456));
        System.out.println(Math.max(23.12, 23.0));
    }
    
    /**
     * Study more to understand
    public void xExp() {
        double x = 11.635;
        double y = 2.76;
        
        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(y));
        
        //System.out.println("The value of e is " + Math.exp(x));
        //System.out.println("The value of e is " + Math.exp(y));
    }
    */
    public static void main(String args[]) {
        
        Numbers number = new Numbers();
        //number.xxxValue();
        //number.xCompareTo();
        //number.xEquals();
        //number.xValueOf();
        //number.xtoString();
        //number.xParseInt();
        //number.xAbs();
        //number.xCeil();
        //number.xRint();
        //number.xRound();
        //number.xMin();
        number.xMax();
        //number.xExp();
    }
}
