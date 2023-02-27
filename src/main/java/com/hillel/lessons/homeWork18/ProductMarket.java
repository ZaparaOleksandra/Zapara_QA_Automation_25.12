package com.hillel.lessons.homeWork18;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {

    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;

    }

    public List<Product> getProducts() {
        return products;
    }

    public List<String> getAllName() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllNameByAlphabet() {
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Double> getPriceMore10() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Double> getPriceLess5() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 5)
                .collect(Collectors.toList());
    }

    public List<String> getPriceInStr() {
        return products.stream()
                .map(Product::getPrice)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
}
