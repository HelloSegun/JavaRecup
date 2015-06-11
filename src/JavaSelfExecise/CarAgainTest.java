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
public class CarAgainTest {
    
    public static void main(String args[]) {
        CarAgain firstCar = new CarAgain("A");
        CarAgain secondCar = new CarAgain("B");
        
        firstCar.carModel("DBS");
        firstCar.carMake("Aston Martin");
        firstCar.yearVersion(1965);
        firstCar.carColour("Silver");
        firstCar.profile();
        
        secondCar.carModel("Transit Mk1");
        secondCar.carMake("Ford");
        secondCar.yearVersion(1985);
        secondCar.carColour("White");
        secondCar.profile();
        
    }
}
