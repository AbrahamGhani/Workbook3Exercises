package com.pluralsight;
import java.time.*;
import java.io.*;
import java.util.*;


public class ReadFile {

    public static HashMap<String, Inventory> loadCSV(String _filename){
        HashMap<String, Inventory> inventoryMap = new HashMap<>();

        try {
            FileReader fileReader = new FileReader(_filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] itemDetails = line.split("\\|");
                int id = Integer.parseInt(itemDetails[0]);
                String name = itemDetails[1];
                double price = Double.parseDouble(itemDetails[2]);

                Inventory item = new Inventory(id,name,price);

                inventoryMap.put(name,item);
            }

        }catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }

        return inventoryMap;
    }


}
