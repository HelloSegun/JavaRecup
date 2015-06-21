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
public class Puppy {
    
    String name;
    int puppyAge;
    String colour;
    String action;
    String position;
    
    public Puppy(String name) {
        this.name = name;
    }
    
    public void pupAge(int pupAge) {
        puppyAge = pupAge;
    }
    
    public void pupColour(String pupColour) {
        colour = pupColour;
    }
    
    public void pupAct(String pupAct) {
        action = pupAct;
    }
    
    public void pupPos(String pupPos) {
        position = pupPos;
    }
    
    public void character() {
        System.out.println(position + " puppy on display");
        System.out.println("The one " + action );
        System.out.println("Age " + puppyAge + " weeks old");
        System.out.println("Colour " + colour);
        System.out.println("\n");
        
    }
}
