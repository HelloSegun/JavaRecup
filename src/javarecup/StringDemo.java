/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Strings
 * http://www.tutorialspoint.com/java/java_strings.htm
 */
public class StringDemo {
    
    public void creatingStrings() {
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
    
    public void stringLength() {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println("String Length is : " +len);
    }
    
    public void concatenatingStrings() {
        String string1 = "saw I was ";
        System.out.println("Dot " + string1 + "Tod");
    }
    
    public void stringFormat() {
        String fs;
        String s = "Final";
        float f = 10;
        int d = 15;
        fs = String.format("the value of the float variable is " +
                           "%f, while the value of the integer " +
                           "variable is %d, and the string " +
                           "is %s", f, d, s);
        
        System.out.println(fs);
    }
    
    public void stringCharAt() {
        String s = "Strings are immutable";
        
        char c = s.charAt(8);
        System.out.println(c);
    }
    
    public void stringCompareTo() {
        String str1 = "Strings are immutable";
            String str2 = "Strings are immutable";
        String str3 = "Integers are not immutable";
        
        int result = str1.compareTo(str2);
        System.out.println(result);
        
        result = str2.compareTo(str3);
        System.out.println(result);
        
        result = str3.compareTo(str1);
        System.out.println(result);
    }
    
    public void stringConcat() {
        String s = "Strings are immutable";
        s = s.concat(" all the time.");
        
        System.out.println(s);
    }
    
    public void stringContentEquals() {
        String str1 = "Not immutable";
        String str2 = "Strings are immutable";
        StringBuffer str3 = new StringBuffer("Not immutable");
        
        boolean result = str1.contentEquals(str3);
        System.out.println(result);
        
        result = str2.contentEquals(str3);
        System.out.println(result);
    }
    
    public void stringCopyValueOf() {
        char[] str1 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str2 = " ";
        
        str2 = str2.copyValueOf( str1 );
        System.out.println(str2);
        
        str2 = str2.copyValueOf(str1, 2, 6);
        System.out.println(str2);
    }
    
    public static void main (String args[]) {
        
        StringDemo StrDemo = new StringDemo();
        
        //StrDemo.creatingStrings();
        //StrDemo.stringLength();
        //StrDemo.concatenatingStrings();
        //StrDemo.stringFormat();
        //StrDemo.stringCharAt();
        //StrDemo.stringCompareTo();
        //StrDemo.stringConcat();
        //StrDemo.stringContentEquals();
        //StrDemo.stringCopyValueOf();
        StrDemo.stringCopyValueOf();
    }
    
}
