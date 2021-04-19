package com.streamliners.task3_2;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    //default constructor
    Cart(){
        cartItems =  new ArrayList<>();
        totalAmount = 0;
    }
     Cart add(GroceryCartItem item){
        cartItems.add(item);
        totalAmount+= item.price;
        return this;
     }

    @Override
    public String toString() {
        return "Grocery cart items : \n"+cartItems+" Total Amount = "+totalAmount;
    }
}
