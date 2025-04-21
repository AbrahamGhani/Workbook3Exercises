package com.pluralsight;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


List<String> famousQuotes = new ArrayList<>();

famousQuotes.add("'Power comes in response to a need, not a desire.' - Goku, Dragon Ball Z");
famousQuotes.add("“I would rather be a brainless monkey than a heartless monster. - Goku, Dragon Ball Z");
famousQuotes.add("'If you don’t take risks, you can’t create a future' - Monkey D. Luffy, One Piece");
famousQuotes.add("'You should enjoy the little detours. Because that's where you'll find the things more important than what you want.' - Ging Freecss, Hunter x Hunter");
famousQuotes.add("'You may have invaded my mind and my body, but there’s one thing a Saiyan always keeps: his pride!' - Vegeta, Dragon Ball Z");
famousQuotes.add("'I do not fear this new challenge. Rather like a true warrior I will rise to meet it.' - Vegeta, Dragon Ball Z");
famousQuotes.add("'Don’t live your life making up excuses. The one making your choices is yourself!' - Mugen, Samurai Champloo");
famousQuotes.add("'Even if I fail again and again, I’ll keep moving forward. That’s what it means to live.' - Rudeus Greyrat, Mushoku Tensei");
famousQuotes.add("' I can’t erase my past, but I can decide who I become.' - Rudeus Greyrat, Mushoku Tensei");
famousQuotes.add("'Admiration is the furthest thing from understanding.' - Sōsuke Aizen, Bleach");
boolean programStart = true;

do {
    try {
        System.out.println("\n-----------------------\nChoose a quote from 1-10 (select -- 0 for random | 100 for exit): ");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        int ranNum = (int)(Math.random() * 10);
        if (userChoice == 100){
            System.out.println("Exiting...");
            programStart = false;
        }
        else if (userChoice == 0){
            System.out.println(famousQuotes.get(ranNum));
        }
        else{
            System.out.println(famousQuotes.get(userChoice - 1));
        }
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.nextLine();
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Number is an invalid option.");
    }
}while (programStart);










    }
}