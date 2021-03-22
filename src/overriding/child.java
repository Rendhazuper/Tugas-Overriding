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
public class child extends Parent{
    
   int defencepower; 
    
   void display(){
       System.out.println("Hero Strength");
       System.out.println("Hero name : "+this.name);
       System.out.println("Defence power : "+this.defencepower);
       
   } 
    
}
