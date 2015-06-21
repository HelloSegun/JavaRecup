/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

/**
 *
 * @author segun
 * Java - Variable Types
 * http://www.tutorialspoint.com/java/java_variable_types.htm
 */
public class EmployeeClassStaticVariable {
    
    private static double salary;
    
    public static final String DEPARTMENT = "Development";
    
    public static void main(String args[]) {
        salary = 1000;
        System.out.println(DEPARTMENT + " average salary: " + salary);
    }
}
