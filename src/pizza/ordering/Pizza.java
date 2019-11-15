/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.ordering;

import pizza.enums.*;

/**
 * @author up895059
 */

public class Pizza {

    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1;
    private Topping topping2;

    
    public Pizza(Size size, 
            Crust crust,
            Sauce sauce,
            Topping topping1,
            Topping topping2){
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.topping1 = topping1;
        this.topping2 = topping2;
    }


    /*Setters*/
    public void setSize(Size size) {this.size = size;}
    public void setCrust(Crust crust) {this.crust = crust;}
    public void setSauce(Sauce sauce) {this.sauce = sauce;}
    public void setTopping1(Topping topping1) {this.topping1 = topping1;}
    public void setTopping2(Topping topping2) {this.topping2 = topping2;}

    /* Getters*/
    public Size getSize() {return size;}
    public Crust getCrust() {return crust;}
    public Sauce getSauce() {return sauce;}
    public Topping getTopping1() {return topping1;}
    public Topping getTopping2() {return topping2;}
    
    public double getTotalCost(){
        return size.getSize()+
                crust.getCrust()+
                sauce.getSauce()+
                topping1.getTopping()*5+
                topping2.getTopping()*4;
    }

    
    public String getInfo(){
        double totalCost = 0;
        double baseCost = 0;
        String info = "";
        
        baseCost = size.getSize() + crust.getCrust();
        
        totalCost = getTotalCost();
    
        
        info+= String.format(
                "TOTAL COST: £%.2f\n"
                + "%s Size: £%.2f\n"
                + "%s Crust: £%.2f\n"
                + "COST OF BASE: £%.2f\n"
                + "%s Sauce: £%.2f\n"
                + "%s Topping 1: 5 * £%.2f = £%.2f\n"
                + "%s Topping 2: 4 * £%.2f = £%.2f\n",
                totalCost,
                size.toString(), size.getSize(),
                crust.toString(), crust.getCrust(),
                baseCost,
                sauce.toString(), sauce.getSauce(),
                topping1.toString(), topping1.getTopping(), topping1.getTopping()*5,
                topping2.toString(), topping2.getTopping(), topping2.getTopping()*4
                
            );
        
        return info;
        
    }
    
    
    @Override
    public boolean equals(Object object){
        if(object instanceof Pizza) {
            Pizza other = (Pizza) object;
            return (this.size == other.size &&
                    this.crust == other.crust &&
                    this.topping1 == other.topping1 &&
                    this.topping2 == other.topping2 &&
                    this.sauce == other.sauce);
        }else return false;
    }
}
