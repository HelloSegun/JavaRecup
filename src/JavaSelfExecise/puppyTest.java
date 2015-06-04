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
public class puppyTest {
    
    public static void main(String args[]) {
        Puppy pupOne = new Puppy("Sherry");
        Puppy pupTwo = new Puppy("Arnod");
        //Puppy pupThree = new Puppy("Sheenda");
        
        pupOne.pupPos("First");
        pupOne.pupAge(2);
        pupOne.pupColour("White");
        pupOne.pupAct("Sleeping");
        pupOne.character();
        
        pupTwo.pupPos("Second");
        pupTwo.pupAge(1);
        pupTwo.pupColour("grey");
        pupTwo.pupAct("Barking");
        pupTwo.character();
    }
}
