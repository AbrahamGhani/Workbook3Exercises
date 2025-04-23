package com.pluralsight;
import java.util.*;
import java.io.*;

public class ProductReader {

    public static List<Product> readProductFromCSV(String _filename) {
        // initializing array i need to return later
        List<Product> productList = new ArrayList<>();

        /*
        Pseudocode breaking down steps in english
        need try and catch
        step 1 -- read file
        step 2 store data internally to variables
        step 3 - create product
        step 4 add the product into the productsList
         */

        try {
            FileReader fileReader = new FileReader(_filename);
            BufferedReader reader = new BufferedReader(fileReader);

            // Skip the first line (it contains column names like id,name,price,stock)
            reader.readLine();

            String line;
            // Read each remaining line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts, using comma as the separator
                String[] parts = line.split(",");

                // Check if the line has exactly 4 parts (id, name, price, stock)
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);        // Convert the first part to an integer (ID)
                    String name = parts[1];                     // Get the name as text
                    double price = Double.parseDouble(parts[2]); // Convert price to a decimal number
                    int stock = Integer.parseInt(parts[3]);     // Convert stock to an integer

                    // Create a new Product object using the parts
                    Product p = new Product(id, name, price, stock);

                    // Add the product to the list
                    productList.add(p);
                    System.out.println("The product, " + p.getName() + ", has been added to the list");
                     }//if statement end
                }//while loop end
            }/*end of try start of catch*/
        catch(IOException e) {
            System.out.println("There was an error");
            }

            return productList;//returning productList
        }//readProductFromCSV method


    }//entire class

