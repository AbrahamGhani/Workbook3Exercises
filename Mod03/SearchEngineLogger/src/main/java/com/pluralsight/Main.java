package com.pluralsight;
import java.time.*;
import java.io.*;
import java.util.*;


public class Main {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        try {
            FileWriter fileWriter = new FileWriter("logs.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean startSearchEngine = false;
            System.out.println("Do you want to launch the search engine?\n- launch\n- cancel");
            String userLaunchAppChoice = scanner.nextLine();

            bufferedWriter.write(LocalDateTime.now() +" " + userLaunchAppChoice);
            bufferedWriter.newLine();

            if (userLaunchAppChoice.equalsIgnoreCase("launch")){
                startSearchEngine = true;
                System.out.println("You can type exit to close the program at any time");
            }

            while (startSearchEngine) {
                System.out.println("search: ");
                String userSearch = scanner.nextLine();
                bufferedWriter.write(LocalDateTime.now()+ " search: " + userSearch);
                bufferedWriter.newLine();
                if (userSearch.equalsIgnoreCase("exit")){
                    startSearchEngine = false;
                    break;
                }


            }
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}