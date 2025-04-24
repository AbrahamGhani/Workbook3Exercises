package com.pluralsight;
import java.io.*;
import java.util.*;
import java.time.*;

public class ReadInventoryFile {


    public static List<Inventory> readInventoryFile(String _fileToRead){
        List<Inventory> inventoryList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(_fileToRead);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[]itemDetails = line.split("\\|");
                if (itemDetails.length == 3) {
                    int id = Integer.parseInt(itemDetails[0]);
                    String name = itemDetails[1];
                    double price = Double.parseDouble(itemDetails[2]);

                    Inventory i = new Inventory(id,name,price);

                    inventoryList.add(i);
                }
            }

        } catch (IOException e){
            System.out.println("IOException");
        }

        return inventoryList;
    }

}
