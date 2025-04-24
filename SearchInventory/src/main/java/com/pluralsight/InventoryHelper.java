package com.pluralsight;

import java.util.List;
import java.io.*;
import java.util.*;
import java.time.*;
public class InventoryHelper {
    static Scanner scanner = new Scanner(System.in);
    public static void listAllItems(List<Inventory> _inventoryList){
        for (Inventory item : _inventoryList){
            System.out.println("------------------------------");
            item.displayItemInfo();
            System.out.println("------------------------------");
        }
    }



    public static void searchItemByID(List<Inventory> _inventoryList){
        System.out.println("Enter the ID of the item you want to find.");
        int userIdInput = scanner.nextInt();
        scanner.nextLine();
        for (Inventory i : _inventoryList){
            if (i.getId() == userIdInput){
                System.out.println("------------------------------");
                i.displayItemInfo();
                System.out.println("------------------------------");
            }
        }
    }


    public static void searchItemByPriceRange(List<Inventory> _inventoryList){
        System.out.println("Enter the starting price range");
        double userPriceRange1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the ending price range");
        double userPriceRange2 = scanner.nextDouble();
        scanner.nextLine();

        for (Inventory i : _inventoryList){
            if (i.getPrice() >= userPriceRange1 && i.getPrice() <= userPriceRange2){
                System.out.println("------------------------------");
                i.displayItemInfo();
                System.out.println("------------------------------");
            }
        }
    }

    public static void addItemToList(List<Inventory> _inventoryList){
        System.out.println("Enter the following details.\nID:");
        int idNewItem = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: ");
        String nameNewItem = scanner.nextLine();
        System.out.println("Price: ");
        double priceNewItem = scanner.nextDouble();
        scanner.nextLine();
        boolean itemExists = false;
        for (Inventory i : _inventoryList){
            if (i.getId() == idNewItem || i.getName().equals(nameNewItem)){
                itemExists = true;
            }
        }
        if (!itemExists) {
            Inventory i = new Inventory(idNewItem, nameNewItem, priceNewItem);
            _inventoryList.add(i);
        }

        if (itemExists){
            System.out.println("An item with this name or ID already exists.");
        }
    }


}
