/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.ordering;

import java.util.ArrayList;
import pizza.enums.*;


/**
 *
 * @author up895059
 */
public class Order {
    
    private ArrayList<Pizza> listPizza;
    
    public Order(){
        this.listPizza = new ArrayList<Pizza>();
    }

    public void setListPizza(ArrayList<Pizza> listPizza) {
        this.listPizza = listPizza;
    }

    public ArrayList<Pizza> getListPizza() {return listPizza;}
    
    public void addPizza(Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2){
        Pizza p = new Pizza(size, crust, sauce, topping1, topping2);
        listPizza.add(p);
    }
    
    public void addPizza(Pizza newPizza){
        listPizza.add(newPizza);
    }
    
    public Pizza getPizza(int pizzaNum){
        return listPizza.get(pizzaNum-1);
    }
    
    public String orderInfo(){
        String orderInfo = "";
        int pizzaNum = 1;
        
        for(Pizza p : listPizza){
            orderInfo += "Pizza Number "+pizzaNum+"\n";
            orderInfo += p.getInfo()+"\n";
            pizzaNum += 1;
        }
        
        return orderInfo; 
    }
    
    public double totalCost(){
        double cost = 0;
        for(Pizza p : listPizza){
            cost+= p.getTotalCost();
        }
        return cost;
    }
    
    public int numOfPizzas(){
        return listPizza.size();
    }
    
    
    public void deletePizza(int pizzaNum){
        listPizza.remove(pizzaNum-1);
    }
    
    public void setPizzaSize(int pizzaNum, Size size){
        listPizza.get(pizzaNum-1).setSize(size);        
    }
    
    public void setPizzaCrust(int pizzaNum, Crust crust){
        listPizza.get(pizzaNum-1).setCrust(crust);
    }
            
    public void setPizzaSauce(int pizzaNum, Sauce sauce){
        listPizza.get(pizzaNum-1).setSauce(sauce);
    }
            
    public void setPizzaTopping1(int pizzaNum, Topping topping1){
        listPizza.get(pizzaNum-1).setTopping1(topping1);
    }
            
    public void setPizzaTopping2(int pizzaNum, Topping topping2){
        listPizza.get(pizzaNum-1).setTopping2(topping2);
    }

}














































































































































































