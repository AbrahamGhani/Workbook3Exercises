package com.pluralsight;

import java.util.*;
import java.io.*;

public class Main {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
boolean startStoryBooks = true;
while (startStoryBooks) {
    try {
            System.out.println("Choose a story:\n1 = Goldilocks\n2 - Hansel and Gretel\n3 - Mary Had A Little Lamb\n4 - Exit");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 1:
                    System.out.println("------------------------ Goldilocks ------------------------");
                    FileInputStream fisGoldi = new FileInputStream("goldilocks.txt");

                    // Use Scanner to read the file
                    Scanner readGoldi = new Scanner(fisGoldi);
                    while (readGoldi.hasNextLine()) {
                        String line = readGoldi.nextLine();
                        System.out.println(line);
                    }
                    readGoldi.close();
                    break;
                case 2:
                    System.out.println("------------------------ Hansel and Gretel ------------------------");
                    FileInputStream fisHanselAndGretel = new FileInputStream("hansel_and_gretel.txt");
                    Scanner readHanselAndGretel = new Scanner(fisHanselAndGretel);

                    while (readHanselAndGretel.hasNextLine()) {
                        String line = readHanselAndGretel.nextLine();
                        System.out.println(line);
                    }
                    readHanselAndGretel.close();
                    break;
                case 3:
                    System.out.println("------------------------ Mary Had A Little Lamb ------------------------");
                    FileInputStream fisMaryHadALittleLamb = new FileInputStream("mary_had_a_little_lamb.txt");
                    Scanner readMHALL = new Scanner(fisMaryHadALittleLamb);

                    while (readMHALL.hasNextLine()) {
                        String line = readMHALL.nextLine();
                        System.out.println(line);
                    }
                    readMHALL.close();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    startStoryBooks = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Please use a number.");
            scanner.nextLine();
        }




    }
}}