/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - String Buffer & String Builder Classes
 * http://www.tutorialspoint.com/java/java_string_buffer.htm
 */
public class StringBuffr {
    
    public void stringBuffrAppend() {
        StringBuffer sb = new StringBuffer("Test");
        sb.append(" String Buffer");
        
        System.out.println(sb);
    }
    
    public void stringBuffrReverse() {
        StringBuffer sb = new StringBuffer("Game Plan");
        sb.reverse();
        
        System.out.println(sb);
    }
    
    public void stringBuffrDelete() {
        StringBuffer sb = new StringBuffer("abcdefghijk");
        sb.delete(3, 7);
        
        System.out.println(sb);
    }
    
    public void stringInsert() {
        StringBuffer sb = new StringBuffer("abcdefghijk");
        sb.insert(3, "123");
        
        System.out.println(sb);
    }
    
    public void stringReplace() {
        StringBuffer sb = new StringBuffer("abcdefghijk");
        sb.replace(3, 8, "ZARA");
        
        System.out.println(sb);
    }
    
    public static void main(String args[]) {
        StringBuffr str = new StringBuffr();
        
        //str.stringBuffrAppend();
        //str.stringBuffrReverse();
        //str.stringBuffrDelete();
        //str.stringInsert();
        str.stringReplace();
    }
}
