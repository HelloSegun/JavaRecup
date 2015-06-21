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
public class Employee {
    
    String name;
    int age;
    String designation;
    double salary;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public void empAge(int empAge) {
        age = empAge;
    }
    
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }
    
    public void empSalary(double empSalary) {
        salary = empSalary;
    }
    
    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
    
}
