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
    
    public static void main (String args[]) {
        
        StringDemo StrDemo = new StringDemo();
        
        //StrDemo.creatingStrings();
        //StrDemo.stringLength();
        StrDemo.concatenatingStrings();
    }
    
}
