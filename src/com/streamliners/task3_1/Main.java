package com.streamliners.task3_1;

public class Main {
    public static void main(String[] args) {
    Product apple = new Product("Apple",100);
    Product apple1 = new Product("Apple",100);
    Product orange = new Product("orange",80);

        System.out.println(apple);
        System.out.println(apple1);
        System.out.println(orange);
        if(apple.equals(apple1))
            System.out.println("apple is equal to apple1");
        else
            System.out.println("apple is not equal to apple1");
        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(apple,7);
        System.out.println(specialProduct);
    }
}
