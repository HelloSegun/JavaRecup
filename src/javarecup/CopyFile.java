/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarecup;

import java.io.*;
/**
 *
 * @author Kuyes10
 * Java - Files and I/O
 * http://www.tutorialspoint.com/java/java_files_io.htm
 */
public class CopyFile {
    
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        
        try {
            in = new FileReader("C:/Users/segun/Documents/NetBeansProjects/JavaRecup/src/javarecup/DocumentFiles/input.txt");
            out = new FileWriter("C:/Users/segun/Documents/NetBeansProjects/JavaRecup/src/javarecup/DocumentFiles/Output.txt");
            
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
