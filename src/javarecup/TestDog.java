/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Overriding
 * http://www.tutorialspoint.com/java/java_overriding.htm
 */
class Animal {
    public void move() {
        System.out.println("Animal can move");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dog can walk and run");
    }
}

public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); //Animal reference but Dog object
        
        a.move(); //runs the method in the Animal class
        b.move(); //runs the method in the Dog class
    }
}
