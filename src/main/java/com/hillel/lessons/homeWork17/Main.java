package com.hillel.lessons.homeWork17;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product = new Product("Potato", 15.01);
        Product product1 = new Product("Onion", 10.01);
        Product product2 = new Product("Tomato", 4.99);
        Product product3 = new Product("Cucumber", 35.50);
        Product product4 = new Product("Carrot", 2.50);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        ProductMarket productMarket = new ProductMarket(list);

        System.out.println("Names of the products: " + productMarket.getAllName());
        System.out.println("Names of the products by Alphabet: " + productMarket.getAllNameByAlphabet());
        System.out.println("Prices more 10 hrn: " + productMarket.getPriceMore10());
        System.out.println("Prices less 5 hrn: " + productMarket.getPriceLess5());
        System.out.println("Prices in String: " + productMarket.getAllPriceInStr());

    }
}
