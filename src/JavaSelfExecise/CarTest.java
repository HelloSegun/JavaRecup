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
public class CarTest {
    
    public static void main(String args[]) {
        Car firstCar = new Car("A");
        Car secondCar = new Car ("B");
        
        firstCar.carMake("BMW");
        firstCar.carModel("7 Series");
        firstCar.yearMade(2015);
        firstCar.carColour("Blue");
        firstCar.carProflie();
        
        secondCar.carMake("Audi");
        secondCar.carModel("RS 3");
        secondCar.yearMade(2015);
        secondCar.carColour("Grey");
        secondCar.carProflie();
        
        
    }
}
