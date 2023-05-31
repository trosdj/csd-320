/* DJ Trost | CSD320 | Assignment 1 | 28 May 2023
Computes energy needed to heat water from one temp to another given by usr
*/

import java.util.Scanner;

public class ComputeEnergy {
    public static void main(String[] args) {
        // Prompt user for information
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the water's mass, initial temperature, and final temperature.");
        
        System.out.print("Mass (kg): "); // Gathers water's mass
        double waterMass = input.nextDouble();

        System.out.print("Initial Temperature (oC): "); // Gathers water's initial temp
        double initialTemperature = input.nextDouble();

        System.out.print("Final Temperature (oC): "); // Gathers water's desired final temp
        double finalTemperature = input.nextDouble();

        // Calculate energy in Joules
        double Q = waterMass * ( finalTemperature - initialTemperature ) * 4184;

        // Display results
        System.out.println("The energy needed is " + Q + " Joules.");
    }
}