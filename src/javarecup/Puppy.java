/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Object & Classes
 * http://www.tutorialspoint.com/java/java_object_classes.htm
 */
public class Puppy {
    
    int puppyAge;
    
    public Puppy(String name) {
        System.out.println("Passed Name is: " + name);
    }
    
    public void setAge(int age) {
        puppyAge = age;
    }
    
    public int getAge() {
        System.out.println("Puppy's age is: " + puppyAge);
        return puppyAge;
    }
    
    public static void main (String args[]) {
        
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable Value: " + myPuppy.puppyAge);
    }
    
}
