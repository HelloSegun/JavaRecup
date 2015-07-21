/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

import java.io.*;
/**
 *
 * @author segun
 * Java - DataInputStream
 * http://www.tutorialspoint.com/java/java_datainputstream.htm
 */
public class DataInputStreamExample {
    
    public static void main(String[] args) throws IOException {
        
        DataInputStream d = new DataInputStream(new FileInputStream("C:/Users/segun/Documents/NetBeansProjects/JavaRecup/src/javarecup/DocumentFiles/test.txt"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("C:/Users/segun/Documents/NetBeansProjects/JavaRecup/src/javarecup/DocumentFiles/test1.txt"));
        
        String count;
        while((count = d.readLine()) != null) {
            String u = count.toUpperCase();
            System.out.println(u);
            out.writeBytes(u + " ,");
        }
        d.close();
        out.close();
    }
}
