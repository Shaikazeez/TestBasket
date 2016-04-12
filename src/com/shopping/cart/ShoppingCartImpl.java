package com.shopping.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azeez on 4/12/2016.
 */
public class ShoppingCartImpl {
    public static void main(String args[]){
        FruitCart fruitCart=new FruitCart();
        List<Fruit> listOfFruits=new ArrayList<>();
        listOfFruits.add(new Fruit(FruitName.APPLE,60));
        listOfFruits.add(new Fruit(FruitName.BANANA,50));
        listOfFruits.add(new Fruit(FruitName.LEMON,25));
        listOfFruits.add(new Fruit(FruitName.ORANGE,45));
        listOfFruits.add(new Fruit(FruitName.PEACH,75));
        fruitCart.addFruits(listOfFruits);
        System.out.println("Total Cost of Fruits= £"+fruitCart.getCost());


    }
}
