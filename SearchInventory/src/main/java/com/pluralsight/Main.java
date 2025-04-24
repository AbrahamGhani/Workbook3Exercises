package com.pluralsight;
import java.io.*;
import java.util.*;
import java.time.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    List<Inventory> inventoryList = ReadInventoryFile.readInventoryFile("inventory.csv");

    inventoryList.sort(Comparator.comparing(Inventory::getId));



startInventoryListApplication(inventoryList);






    }

public static void startInventoryListApplication(List<Inventory> _inventoryList){
    boolean menu = true;
    while (menu){
        System.out.println("What do you want to do?\n" +
                "1 - List all products\n" +
                "2 - Lookup a product by ID\n" +
                "3 - Find all products withing a price range\n" +
                "4 - Add a new product\n" +
                "5 - Quit application");
        int userMenuDecision = scanner.nextInt();
        scanner.nextLine();
        switch (userMenuDecision){
            case 1:
                InventoryHelper.listAllItems(_inventoryList);
                break;
            case 2:
                InventoryHelper.searchItemByID(_inventoryList);
                break;
            case 3:
                InventoryHelper.searchItemByPriceRange(_inventoryList);
                break;
            case 4:
                InventoryHelper.addItemToList(_inventoryList);
                break;

            case 5:
                System.out.println("Closing Application...\nGoodbye");
                menu = false;
                break;

            default:
                System.out.println("Invalid Input");
        }


    }
}

}