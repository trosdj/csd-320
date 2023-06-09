// DJ Trost | CSD320 | Assignment 3 | 11 June 2023
// Basic rock paper scissors game based on user input and random number generation

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Gathers user choice
        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("[ 1 ] for Rock \n[ 2 ] for Paper \n[ 3 ] for Scissors");
        System.out.print("Your Choice: ");

        int userChoice = input.nextInt();
        System.out.println("");

        // Determine computer's choice
        int computerChoice = 1 + (int)(Math.random() * ((3 - 1) + 1));

        // Display user's choice
        switch (userChoice) {
            case 1:
                System.out.println("You chose Rock!");
                break;
            case 2:
                System.out.println("You chose Paper!");
                break;
            case 3:
                System.out.println("You chose Scissors!");
                break;
        }

        // Display computer's choice
        switch (computerChoice) {
            case 1:
                System.out.println("The computer chose Rock!");
                break;
            case 2:
                System.out.println("The computer chose Paper!");
                break;
            case 3:
                System.out.println("The computer chose Scissors!");
                break;
        }
        
        System.out.println("");

        // Determines and displays results

        if (userChoice == computerChoice) {     // If both user and computer choose the same thing
            System.out.println("Draw!");
        }

        if (userChoice == 1 && computerChoice != 1) {       // If the user chooses rock
            if (computerChoice == 2) {
                System.out.println("The computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }
        else if (userChoice == 2 && computerChoice != 2) {      // If the user chooses Paper
            if (computerChoice == 3) {
                System.out.println("The computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }
        else if (userChoice == 3 && computerChoice != 3) {      // If the user chooses Scissors
            if (computerChoice == 1) {
                System.out.println("The computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }

        System.out.println("");
    }
}