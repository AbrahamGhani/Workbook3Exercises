package com.pluralsight;
import java.io.*;
import java.util.*;
import java.time.*;
public class Inventory {
    int id;
    String name;
    double price;

    public Inventory(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Inventory() {
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


    public void displayItemInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);

    }






}
