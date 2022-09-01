package rockpaperscissors;

import java.util.*;

public class app {

    public static void main(String[] args) {

            //rock, paper, scissors game
    Scanner input = new Scanner(System.in);
    int userChoice = 0;
    int computerChoice = 0;


        try {
            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("");
            System.out.println("Please enter your choice:");
            System.out.println("");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("");
            System.out.println("Enter your choice:");
            userChoice = input.nextInt();
            System.out.println("");
            System.out.println("Computer's choice:");
            computerChoice = (int) (Math.random() * 3) + 1;
            System.out.println("");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("");
            System.out.println("Computer's choice:");
            System.out.println("");
            System.out.println(computerChoice);
            System.out.println("");
    
        if (userChoice == 1 && computerChoice == 1) {
            System.out.println("It's a tie!");
            } else if (userChoice == 1 && computerChoice == 2) {
                System.out.println("You lose!");
            } else if (userChoice == 1 && computerChoice == 3) {
                System.out.println("You win!");
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("You win!");
            } else if (userChoice == 2 && computerChoice == 2) {
                System.out.println("It's a tie!");
            } else if (userChoice == 2 && computerChoice == 3) {
                System.out.println("You lose!");
            } else if (userChoice == 3 && computerChoice == 1) {
                System.out.println("You lose!");
            } else if (userChoice == 3 && computerChoice == 2) {
                System.out.println("You win!");
            } else if (userChoice == 3 && computerChoice == 3) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Invalid choice!");
            } 
        input.close();
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            } finally {
                System.out.println("Thank you for playing!");
        }
    } 
}
