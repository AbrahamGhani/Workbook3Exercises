package com.pluralsight;

public class Product {

        int id;
        String name;
        double price;
        int stock;

        //empty constructor so i dont need to provide values
        public Product(){

        }
        //filled constructor for if i know all details when creating it i can just do that all in one
        public Product(int id, String name, double price, int stock) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }


        public void displayProductInfo(){
            System.out.println("ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Price: " + this.price);
            System.out.println("Stock: " + this.stock);

        }

}
