// DJ Trost | CSD320 | Assignment 4 | 11 June 2023
// Prompts User for 2 stings and checks if either string is a substring of each other

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        // Prompt user for strings
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Please enter two stings.\n");

        System.out.print("String One: ");
        String stringOne = input.nextLine();

        System.out.print("String Two: ");
        String stringTwo = input.nextLine();

        if (stringOne.contains(stringTwo)) {    // If stringOne contains stringTwo
            System.out.println("\n'" + stringTwo + "'" + " is a substring of " + "'" + stringOne + "'");
        }
        else if (stringTwo.contains(stringOne)) {   // If stringTwo contains stringOne
            System.out.println("\n'" + stringOne + "'" + " is a substring of " + "'" + stringTwo + "'");
        }
        else {      // If neither are substrings
            System.out.println("\nNeither " + "'" + stringOne + "'" + " nor " + "'" + stringTwo + "'" + " are substrings");
        }
    }
}