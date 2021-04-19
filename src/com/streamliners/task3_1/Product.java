package com.streamliners.task3_1;

public class Product {
    String name;
    int price;

    //default constructor
    Product() {

    }
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

  @Override
    public String toString() {
        return String.format("Name : %s  @ Rs. %d",name,price);
   }

    @Override
    public boolean equals(Object o) {
        Product product = (Product)o;
        if(this.name== product.name){
            return true;
        }
        else
            return false;
    }


}
