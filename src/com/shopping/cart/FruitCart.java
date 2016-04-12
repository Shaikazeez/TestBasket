package com.shopping.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azeez on 4/12/2016.
 */
public class FruitCart {
    private List<Fruit> fruitList;

    public FruitCart(){
        fruitList=new ArrayList<>();
    }
    public FruitCart(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public void addFruits(List<Fruit> fruits){
        fruits.stream().forEach(fruit -> fruitList.add(fruit));
    }
    public double getCost(){
        double totalCost=0.0;
        for(Fruit fruit:fruitList){
            totalCost+=fruit.getPrice();
        }
        //fruitList.stream().forEach(fruit -> totalCost=+fruit.getPrice());
        return totalCost>0.0? totalCost/100: totalCost;
    }
}
