// DJ Trost | CSD320 | Assignment 9 | 9 July 2023
// Finds the highest value, lowest value, sum, and average of an array of integers entered by user

import java.util.Scanner;

public class IntegerArray {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        intArray = getArray(intArray);

        // Print statements for each method
        System.out.printf("\nHighest Value: \t%d",highestValue(intArray));
        System.out.printf("\nLowest Value: \t%d",lowestValue(intArray));
        System.out.printf("\nSum: \t\t%d",sumValue(intArray));
        System.out.printf("\nAverage: \t%d",averageValue(intArray));
        System.out.println("\n");
    }

    // Gets the array from user
    public static int[] getArray(int[] list) {
        Scanner input = new Scanner(System.in);

        list = new int[20];

        System.out.print("\nEnter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        return list;
    }

    // Calculates and returns highest value
    public static int highestValue(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) max = list[i];
        }

        return max;
    }

    // Calculates and returns lowest value
    public static int lowestValue(int[] list) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) min = list[i];
        }

        return min;
    }

    // Calculates and returns the sum of the values in the array
    public static int sumValue(int[] list) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }

        return total;
    }

    // Calculates and returns the average of the values in the array
    public static int averageValue(int[] list) {
        int average = sumValue(list) / list.length;

        return average;
    }
}