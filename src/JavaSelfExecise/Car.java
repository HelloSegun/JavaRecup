/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaSelfExecise;

/**
 *
 * @author segun
 */
public class Car {
    
    String tag;
    String model;
    String make;
    int year;
    String colour;
    
    public Car(String tag) {
        this.tag = tag;
    }
    
    public void carModel(String carModel) {
        model = carModel;
    }
    
    public void carMake(String carMake) {
        make = carMake;
    }
    
    public void yearMade(int yearMade) {
        year = yearMade;
    }
    
    public int getYearMade() {
        System.out.println("Year made is: " + year);
        System.out.println(" ");
        return year;
    }
    
    public void carColour(String carColour) {
        colour = carColour;
    }
    
    public void carProflie() {
        System.out.println("Car: " + tag);
        System.out.println("It's a " + colour +" "+ year +" "+ make +" "+ model);
        System.out.println(" ");
    }
    
}
