/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author GAMES
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        child input = new child();
        input.name = "mountain lady";
        input.defencepower = 100; 
        input.display();
        
        
        
        childlagi hero = new childlagi();
        hero.name = "lion";
        hero.defencepower = 200; 
        hero.display();
        
    }
    
}
