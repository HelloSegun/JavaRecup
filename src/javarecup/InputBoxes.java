/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

import javax.swing.JOptionPane;

/**
 *
 * @author segun
 * Java Option Panes
 * http://www.homeandlearn.co.uk/java/java_option_panes.html
 */
public class InputBoxes {
    
    public static void main(String args[]) {
        
        String first_name;
        first_name = JOptionPane.showInputDialog("First Name", "Enter Your First Name");
        
        String family_name;
        family_name = JOptionPane.showInputDialog("Family Name", "Enter Your Family Name");
        
        String full_name;
        full_name = "You are " + first_name + " " + family_name;
        
        JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }
}
