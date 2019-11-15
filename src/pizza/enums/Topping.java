/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.enums;

/**
 *
 * @author up895059
 */
public enum Topping {
    NONE (0),
    OLIVES (0.08),
    EXTRA_CHEESE (0.02),
    CHILI (0.06),
    PEPPERONI (0.1),
    MUSHROOM (0.03),
    ROCKET (0.05),
    JALAPENOS (0.2),
    ONION (0.07),
    ANCHOVY (0.09);
    
    private double topping;
    
    Topping(double topping){
        this.topping = topping;
    }
    
    public double getTopping(){return topping;}
    
}
