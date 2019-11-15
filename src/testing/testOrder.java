/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import pizza.enums.*;
import pizza.ordering.*;

/**
 *
 * @author up895059
 */
public class testOrder {
    public static void main(String[] args) {
        Order myOrders = new Order();
        
        myOrders.addPizza(Size.SMALL, Crust.STUFFED, Sauce.TOMATO, Topping.EXTRA_CHEESE, Topping.ONION);
        myOrders.addPizza(Size.MEDIUM, Crust.THIN, Sauce.PESTO, Topping.NONE, Topping.JALAPENOS);
        myOrders.addPizza(Size.SMALL, Crust.THIN, Sauce.PESTO, Topping.PEPPERONI, Topping.JALAPENOS);
        myOrders.addPizza(Size.LARGE, Crust.DEEP, Sauce.TOMATO, Topping.OLIVES, Topping.ONION);
        myOrders.addPizza(Size.LARGE, Crust.STUFFED, Sauce.TOMATO, Topping.JALAPENOS, Topping.ROCKET);
        
        
        System.out.println(myOrders.orderInfo());
        System.out.println("\n\n\n------------- UPDATING THE PIZZA ---------------");
        
        myOrders.setPizzaSize(1, Size.LARGE);
        myOrders.setPizzaCrust(2, Crust.DEEP);
        myOrders.setPizzaSauce(3, Sauce.TOMATO);
        myOrders.setPizzaTopping1(5, Topping.MUSHROOM);
        myOrders.setPizzaTopping2(5, Topping.JALAPENOS);
        
        System.out.println(myOrders.orderInfo());
        
        System.out.println("\n\n\n------------- DELETING A PIZZA--------------\n"
                + "Will delete the pizza num 5");
        myOrders.deletePizza(5);
        
        
        System.out.println(myOrders.orderInfo());
        
        
        
    }
}
