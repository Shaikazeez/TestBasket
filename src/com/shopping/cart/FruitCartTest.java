package com.shopping.cart;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Azeez on 4/12/2016.
 */
public class FruitCartTest {

    FruitCart fruitCart;
    List<Fruit> fruitList ;

    @Before
    public void setup(){
        fruitCart=new FruitCart();
        fruitList=new ArrayList<>();
    }

    @Test
    public void test_Total_Fruit_Cost(){
        fruitList.add(new Fruit(FruitName.APPLE,60));
        fruitList.add(new Fruit(FruitName.BANANA,50));
        fruitList.add(new Fruit(FruitName.LEMON,25));
        fruitList.add(new Fruit(FruitName.ORANGE,45));
        fruitList.add(new Fruit(FruitName.PEACH,75));
        fruitCart.addFruits(fruitList);
        double totalCost=fruitCart.getCost();
        assertEquals("2.55",Double.toString(totalCost) );
    }

    @Test
    public void test_Total_Fruit_Cost_For_Empty_FruitList(){
        fruitCart.addFruits(fruitList);
        double totalCost=fruitCart.getCost();
        assertEquals("0.0",Double.toString(totalCost) );
    }

}