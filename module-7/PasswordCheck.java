/* DJ Trost | CSD320 | Assignment 7 | 2 July 2023
Checks if user input password matches the requirements for a secure password
*/

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Passwords must have: \n - At least 8 characters\n - Both letters and digits\n - At least 1 uppercase character\n - At least one lowercase character\n");
        System.out.println("Please Enter Your Password: ");

        String usrPassword = input.nextLine();
        System.out.println("");

        checkPassword(usrPassword);
    }

    static void checkPassword(String password) {
        // Variables to check if a requirement is met or not
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {     // Adds 1 for each uppercase character
                upperCount++;
            }
            if (Character.isLowerCase(c)) {     // Adds 1 for each lowercase character
                lowerCount++;
            }
            if (Character.isDigit(c)) {     // Adds 1 for each digit
                digitCount++;
            }
        }
        // Runs if all requirements are met
        if (password.length() >= 8 && upperCount >= 1 && lowerCount >= 1 && digitCount >= 1) {
            System.out.println("Your password meets the requirements!");
        }
        else {
            System.out.println("Your password is not valid!\n");

            // If the check variable is still 0 this prints what is missing
            if (password.length() < 8) {
                System.out.println("Your password needs to be at least 8 characters");
            }
            if (upperCount == 0) {
                System.out.println("Your password needs at least 1 uppercase character");
            }
            if (lowerCount == 0) {
                System.out.println("Your password needs at least one lowercase character");
            }
            if (digitCount == 0) {
                System.out.println("Your password needs at least one digit");
            }
            System.out.println("");
        }
    }
}
