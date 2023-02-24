package com.hillel.lessons.homeWork17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {

    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<String> getAllName() {
        List<String> names = new ArrayList<>();

        for (Product productName : products) {
            names.add(productName.getName());
        }
        return names;
    }

    public List<String> getAllNameByAlphabet() {
        List<String> names = getAllName();
        Collections.sort(names);
        return names;
    }

    public List<Double> getAllPrice() {
        List<Double> allPrices = new ArrayList<>();

        for (Product prices : products) {
            allPrices.add(prices.getPrice());
        }
        return allPrices;
    }

    public List<Double> getPriceMore10() {
        List<Double> pricesMore10 = new ArrayList<>();

        for (Product productPrices : products) {
            if (productPrices.getPrice() > 10) {
                pricesMore10.add(productPrices.getPrice());
            }
        }
        return pricesMore10;
    }

    public List<Double> getPriceLess5() {
        List<Double> pricesLess5 = new ArrayList<>();

        for (Product productPrices : products) {
            if (productPrices.getPrice() < 5) {
                pricesLess5.add(productPrices.getPrice());
            }
        }
        return pricesLess5;
    }

    public List<String> getAllPriceInStr() {
        List<String> allPricesInStr = new ArrayList<>();

        for (Product prices : products) {
            allPricesInStr.add(String.valueOf(prices.getPrice()));
        }
        return allPricesInStr;
    }
}
