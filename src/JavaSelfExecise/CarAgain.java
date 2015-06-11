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
public class CarAgain {
    
    String tag;
    String model;
    String make;
    int year;
    String colour;
    
    public CarAgain(String carTag) {
        this.tag = carTag;
    }
    
    public void carModel(String carModel) {
        model = carModel;
    }
    
    public String givenCarModel() {
        System.out.println("The Model of the Car is " + model);
        return model;
    }
    
    public void carMake(String carMake) {
        make = carMake;
    }
    
    public String givenCarMake() {
        System.out.println("Car Make is " + make);
        return make;
    }
    
    public void yearVersion(int yearVersion) {
        year = yearVersion;
    }
    
    public int givenYearVersion() {
        System.out.println(year + " Version");
        return year;
    }
    
    public void carColour(String carColour) {
        colour = carColour;
    }
    
    public String givenCarColour() {
        System.out.println("Colour " + colour);
        return colour;
    }
    
    public void profile() {
        System.out.println("Car " + tag);
        givenCarModel();
        givenCarMake();
        givenYearVersion();
        givenCarColour();
        System.out.println(" ");
    }
}
