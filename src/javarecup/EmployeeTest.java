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
public class EmployeeTest {
    
    public static void main(String args[]) {
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Jane");
        
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();
        
        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
