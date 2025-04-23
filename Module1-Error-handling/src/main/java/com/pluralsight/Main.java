package com.pluralsight;
import jdk.jshell.spi.ExecutionControlProvider;

import java.io.StringReader;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            int result = 10 / 0;  // ❌ This will throw an ArithmeticException
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("⚠️ Oops! You can't divide by zero.");
//        }
//
//
//        System.out.println("Program continues after handling the error.");
//
//
//
//
//        String[] names = {
//                "Ezra", "Elisha", "Ian",
//                "Siddalee", "Pursalane", "Zephaniah"
//        };
//
//        boolean success = false;
//
//        while (!success) {
//            try {
//                System.out.print("Pick a kid (select #1 - #6): ");
//                int index = scanner.nextInt();
//                scanner.nextLine(); // clear newline
//
//                if (index < 1 || index > 6) {
//                    System.out.println(" Number out of range. Pick between 1 and 6.");
//                    continue;
//                }
//
//                index--;
//                System.out.println(" You picked: " + names[index]);
//                success = true;
//
//            } catch (InputMismatchException e) {
//                System.out.println(" Not a valid number. Please enter digits only.");
//                scanner.nextLine(); // clear invalid input
//            } catch (Exception e) {
//                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
//                scanner.nextLine();
//            }
//        }
//
//        scanner.close();




        //Challenge: Start with a good "Welcome to the game message"
        //Create a menu
        //Easy mode
        //or Hard mode
        //If picked 1
        //It wil generate a number between 1 and 10
        //if picked 2it will generate a number between 1 and 100
        //Bonus challenge … hard mode (only 5 tries)

boolean gamestart = true;
while (gamestart){
    System.out.println("Welcome to the Number Guessing Game.\n1 - Easy\n2 - Hard\n3 - Exit Game");

    try {
        int userDifficulty = scanner.nextInt();
        scanner.nextLine();
        if (userDifficulty == 1){
            boolean successful = false;
            int correctNumber = (int)(Math.random() * 10) + 1;
            while (!successful) {
                try {
                    System.out.print("Pick a number (between #1 - #10): ");
                    int guessedNumber = scanner.nextInt();
                    scanner.nextLine(); // clear newline

                    if (guessedNumber < 1 || guessedNumber > 10) {
                        System.out.println(" Number out of range. Pick between 1 and 10.");
                        continue;
                    }
                    if(guessedNumber != correctNumber) {
                        if(guessedNumber > correctNumber) {
                            System.out.println("It's to high");
                        }
                        if(guessedNumber < correctNumber )  {
                            System.out.println("its to low");
                        }
                        System.out.println("Wrong, try it again");
                        continue;
                    }
                    System.out.println("You guessed it correct ");
                    successful = true;

                } catch (InputMismatchException e) {
                    System.out.println(" Not a valid number. Please enter digits only.");
                    scanner.nextLine(); // clear invalid input
                } catch (Exception e) {
                    System.out.println("⚠️ Something else went wrong: " + e.getMessage());
                    scanner.nextLine();
                }
            }
        }
        else if (userDifficulty == 2){
            boolean successful = false;
            int correctNumber = (int)(Math.random() * 100) + 1;
            int guessCount = 4;
            while (!successful) {
                try {
                    System.out.print("Pick a number (between #1 - #100): ");
                    int guessedNumber = scanner.nextInt();
                    scanner.nextLine(); // clear newline

                    if (guessedNumber < 1 || guessedNumber > 100) {
                        System.out.println(" Number out of range. Pick between 1 and 100.");
                        continue;
                    }
                    if(guessedNumber != correctNumber) {
                        if (guessCount == 0){
                            System.out.println("Wrong!");
                            System.out.println("The number was " + correctNumber);
                            System.out.println("You used all your guesses.\n GAME OVER");
                            break;
                        }
                        if(guessedNumber > correctNumber) {
                            System.out.println("It's to high");
                        }
                        if(guessedNumber < correctNumber )  {
                            System.out.println("its to low");
                        }
                        System.out.println("Wrong, try it again");
                        System.out.println("You have " + guessCount + " guesses left.");
                        guessCount--;
                        continue;
                    }
                    System.out.println("You guessed it correct ");
                    successful = true;

                } catch (InputMismatchException e) {
                    System.out.println(" Not a valid number. Please enter digits only.");
                    scanner.nextLine(); // clear invalid input
                } catch (Exception e) {
                    System.out.println("⚠️ Something else went wrong: " + e.getMessage());
                    scanner.nextLine();
                }
            }
        } else if (userDifficulty == 3){
            System.out.println("Exiting Program...");
            gamestart = false;
        }
        else {
            System.out.println("Invalid Option");
        }
    }
    catch (InputMismatchException e){
        System.out.println("Error -- Digit Input Only");
        scanner.nextLine();
        continue;
    }
}

//        boolean successful = false;
//        int correctNumber = (int)(Math.random() * 10) + 1;
//        while (!successful) {
//            try {
//                System.out.print("Pick a number (between #1 - #10): ");
//                int guessedNumber = scanner.nextInt();
//                scanner.nextLine(); // clear newline
//
//                if (guessedNumber < 1 || guessedNumber > 10) {
//                    System.out.println(" Number out of range. Pick between 1 and 10.");
//                    continue;
//                }
//                if(guessedNumber != correctNumber) {
//                    if(guessedNumber > correctNumber) {
//                        System.out.println("It's to high");
//                    }
//                    if(guessedNumber < correctNumber )  {
//                        System.out.println("its to low");
//                    }
//                    System.out.println("Wrong, try it again");
//                    continue;
//                }
//                System.out.println("You guessed it correct ");
//                successful = true;
//
//            } catch (InputMismatchException e) {
//                System.out.println(" Not a valid number. Please enter digits only.");
//                scanner.nextLine(); // clear invalid input
//            } catch (Exception e) {
//                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
//                scanner.nextLine();
//            }
//        }

        scanner.close();




    }
}