package com.pluralsight;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String,Inventory> inventoryHashMap = ReadFile.loadCSV("inventory.csv");
        try {


            boolean appOn = true;
            while (appOn) {
                System.out.println("To close the program type - exit\nEnter the name of the product you are looking for.\nName: ");
                String productName = scanner.nextLine();
                if (productName.equalsIgnoreCase("exit")) {
                    appOn = false;
                    break;
                }else if (inventoryHashMap.containsKey(productName)) {
                    inventoryHashMap.get(productName).displayItemInfo();
                }
                else {
                    System.out.println("Invalid -- item not found or typo");
                }

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }
}