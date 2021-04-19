package com.streamliners.task3_2;

public class GroceryCartItem extends GroceryItem{
    int price;
    float quantity;

    //Parameterized constructor
    GroceryCartItem(String name,int pricePerKg){
        super(name,pricePerKg);
    }

    @Override
    public String toString() {
        return  String.format("<%s> (₹<%d> X <%f>kg) = ₹<%d> \n",name,pricePerKg,quantity,price);
    }

    static float extractQuantity(String quantityStr){
        String[] arrOFStr = quantityStr.split(" ");
        String replace = arrOFStr[0].replace("kg","");
        String replace1 = arrOFStr[1].replace("g","");
        float a = Integer.parseInt(replace);
        float b = Integer.parseInt(replace1);
        float c = a + b/1000;
        return  c;
    }
     static GroceryCartItem createNew(GroceryItem item, String quantityStr) {
         GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
         cartItem.quantity = extractQuantity(quantityStr);
         cartItem.price = (int) (cartItem.pricePerKg * cartItem.quantity);
         return cartItem;
     }

}


