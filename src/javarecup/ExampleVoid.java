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
public class ExampleVoid {
    
    public static void main(String[] args) {
        methodRankPoints(255.7);
    }
    
    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank : A1");
        }
        else if (points >= 122.4) {
            System.out.println("Rank : A2");
        }
        else {
            System.out.println("Rank : A3");
        }
    }
    
}
