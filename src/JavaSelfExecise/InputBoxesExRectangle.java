/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaSelfExecise;

import javax.swing.JOptionPane;

/**
 *
 * @author segun
 * Java Option Panes
 * http://www.homeandlearn.co.uk/java/java_option_panes.html
 */
public class InputBoxesExRectangle {
    
    public static void main(String args[]) {
        
        String breadth;
        breadth = JOptionPane.showInputDialog("Rectangle Breadth");
        
        String height;
        height = JOptionPane.showInputDialog("Rectangle Height");
        
        //int area = Integer.parseInt(breadth) * Integer.parseInt(height);
        Float area = Float.parseFloat(breadth) * Float.parseFloat(height);
        
        JOptionPane.showMessageDialog(null, area, "Area of the Rectangle", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }
}
