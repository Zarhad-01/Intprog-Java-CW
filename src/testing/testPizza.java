/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import pizza.enums.Crust;
import pizza.enums.Sauce;
import pizza.enums.Size;
import pizza.enums.Topping;
import pizza.ordering.Pizza;

/**
 *
 * @author up895059
 */
public class testPizza {
    
    public static void main(String args[]){
        Pizza pizza1 = new Pizza(Size.MEDIUM,
                Crust.STUFFED,
                Sauce.PESTO,
                Topping.JALAPENOS,
                Topping.ANCHOVY );
       
        System.out.println(pizza1.getInfo());
        
        pizza1.setSize(Size.LARGE); //Will make the pizza large
        pizza1.setSauce(Sauce.TOMATO); // Will make the sauce Tomato
        
        System.out.println(pizza1.getInfo());
        
    }
}
