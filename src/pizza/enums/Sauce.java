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
public enum Sauce {
    TOMATO(0.0),
    PESTO(0.5);
    
    private double sauce;
    
    Sauce(double sauce){
        this.sauce = sauce;
    }
    
    public double getSauce(){return sauce;}

}
