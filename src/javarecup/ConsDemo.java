/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Method
 * http://www.tutorialspoint.com/java/java_methods.htm
 */
public class ConsDemo {
    
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        System.out.println(t1.x + " " + t2.x);
    }
}

// A simple constructor
class MyClass {
    int x;
    
    // Following is the constructor
    MyClass(int i) {
        x = i;
    }
}
