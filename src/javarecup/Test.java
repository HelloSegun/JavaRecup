/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 */
public class Test {
   
    public void pupAge() {
        /*
        A variable should be initializied in a method, if not, there will be an
        error.
        int age;
        */
        int age = 0;
        age = age = 7;
        System.out.println("Puppy age is: " + age);
    }
    
    public static void main(String args[]) {
        Test test = new Test();
        test.pupAge();
    }
}
