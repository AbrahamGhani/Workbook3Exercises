package com.pluralsight;

import java.util.List;

public class Main {
    public static void main(String[] args) {



List<Product> products= ProductReader.readProductFromCSV("products.csv");

displayListOfProducts(products);



    }

    public static void displayListOfProducts(List<Product> _products){
        System.out.println("\n--LIST OF PRODUCTS--\n");
        for (Product product : _products){
            System.out.println("=======================");
            product.displayProductInfo();
        }
        System.out.println("=======================");
    }

}