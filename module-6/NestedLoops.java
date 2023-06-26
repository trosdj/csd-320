// DJ Trost | CSD320 | Assignment 6 | 25 June 2023
// Uses nested loops to display a specific output of i ** 2

public class NestedLoops {
    public static void main(String[] args) {
        int row = 7; // Sets the number of rows to be printed

        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row - i; j++)
                System.out.print("  ");     // Prints empty spaces before numbers
            for (int j = 0; j < i; j++)
                System.out.print(" " + (int)Math.pow(2, j));    // Prints ascending numbers
            for (int j = i - 2; j >= 0; j--)
                System.out.print(" " + (int)Math.pow(2, j));    // Prints descending numbers
            for (int j = 1; j <= row - i; j++)
                System.out.print("  ");     // Prints empty spaces after numbers
            System.out.println("\t@");      // Moves to next line and lines up @ signs
        }
    }
}
