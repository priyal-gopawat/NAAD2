package com.streamliners.task3_2;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        GroceryItem  sugar = new GroceryItem("sugar",150);
        GroceryItem  tea = new GroceryItem("tea",80);
        GroceryItem  rice = new GroceryItem("rice",200);
        GroceryItem  wheat = new GroceryItem("wheat",100);

        cart.add(GroceryCartItem.createNew(sugar,"3kg 0g"));
        cart.add(GroceryCartItem.createNew(tea,"0kg 750g"));
        cart.add(GroceryCartItem.createNew(rice,"1kg 500g"));
        cart.add(GroceryCartItem.createNew(wheat,"3kg 500g"));
        System.out.println(cart);
    }

}
