package com.streamliners.task3_1;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;

     SpecialProduct(String name,int price){
     super(name,price);
    }

   static SpecialProduct applyOffOnProduct(Product product, int percentageOff){
         int discountedPrice = product.price - product.price*percentageOff/100;
         SpecialProduct specialProduct = new SpecialProduct(product.name, discountedPrice);
         specialProduct.regularPrice = product.price;
         specialProduct.percentageOff = percentageOff;
         return specialProduct;
   }

    @Override
    public String toString() {
        return "Name :"+name+ " @ Rs "+price+" for "+percentageOff+"% discount";
    }

}
