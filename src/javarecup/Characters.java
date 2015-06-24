/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Characters
 * http://www.tutorialspoint.com/java/java_characters.htm
 */
public class Characters {
    
    public void xIsLetter() {
        
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
    }
    
    public void xIsDigit() {
        
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));
    }
    
    public void xIsWhitespace() {
        
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
    }
    
    public void xIsUpperCase() {
        
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));
    }
    
    public void xIsLowerCase() {
        
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.isLowerCase('\n'));
        System.out.println(Character.isLowerCase('\t'));
    }
    
    public void xToUpperCase() {
        
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toUpperCase('C'));
    }
    
    public void xToLowerCase() {
        
        System.out.println(Character.toLowerCase('c'));
        System.out.println(Character.toLowerCase('C'));
    }
    
    public void xToString() {
        
        System.out.println(Character.toString('c'));
        System.out.println(Character.toString('C'));
    }
        
     public static void main(String args[]) {
         
         Characters cha = new Characters();
         //cha.xIsLetter();
         //cha.xIsDigit();
         //cha.xIsWhitespace();
         //cha.xIsUpperCase();
         //cha.xIsLowerCase();
         //cha.xToUpperCase();
         //cha.xToLowerCase();
         cha.xToString();
     }
}
