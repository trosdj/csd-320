// DJ Trost | CSD320 | Assignment 11 | 22 July 2023
// Finds the largest and smallest elements in multi-dimensional arrays

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        
        /* 2D Array of Integers */

        int [][] intArray = new int[5][5];

        System.out.println("\n-- 2D Array of Integers --\n");

        
        // Populates intArray with random values ranging 10-99
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[row].length; column++) {
                intArray[row][column] = (int)(Math.random() * (100 - 10) + 10);
            }
        }
        
        // Displays intArray
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[row].length; column++) {
                System.out.print("| " + intArray[row][column] + " | ");
            }

            System.out.println();
        }

        System.out.printf("\nLargest Element location: %s\n", Arrays.toString(locateLargest(intArray)));
        System.out.printf("Smallest Element location: %s\n", Arrays.toString(locateSmallest(intArray)));

        /* 2D Array of Doubles */

        double [][] doubleArray = new double[5][5];

        System.out.println("\n-- 2D Array of Doubles --\n");

        // Populates doubleArray with random values ranging 10-99
        for (int row = 0; row < doubleArray.length; row++) {
            for (int column = 0; column < doubleArray[row].length; column++) {
                doubleArray[row][column] = Math.random() * (100 - 10) + 10;
            }
        }

        // Displays doubleArray
        for (int row = 0; row < doubleArray.length; row++) {
            for (int column = 0; column < doubleArray[row].length; column++) {
                System.out.printf("| %.2f" + " | ", doubleArray[row][column]);
            }

            System.out.println();
        }

        System.out.printf("\nLargest Element location: %s\n", Arrays.toString(locateLargest(doubleArray)));
        System.out.printf("Smallest Element location: %s\n", Arrays.toString(locateSmallest(doubleArray)));

    }

    public static int [] locateLargest (double [][] arrayParam) {
        double max = arrayParam[0][0];
        int row = 0;
        int column = 0;

        // Iterates over arrayParam to find the largest value
        for (int x = 0; x < arrayParam.length; x++){
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] > max) {
                    max = arrayParam[x][y];     
                    row = x;
                    column = y;

                }
            }
        }

        int [] largestLocation = {row, column};     // Populates a 1D array with row and column of largest value
        
        return largestLocation;
    }

    public static int [] locateLargest (int [][] arrayParam) {
        int max = arrayParam[0][0];
        int row = 0;
        int column = 0;

        for (int x = 0; x < arrayParam.length; x++){
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] > max) {
                    max = arrayParam[x][y];
                    row = x;
                    column = y;

                }
            }
        }

        int [] largestLocation = {row, column};
        
        return largestLocation;
    }

    public static int [] locateSmallest (double [][] arrayParam) {
        double min = arrayParam[0][0];
        int row = 0;
        int column = 0;

        // Iterates over arrayParam to find the largest value
        for (int x = 0; x < arrayParam.length; x++){
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] < min) {
                    min = arrayParam[x][y];
                    row = x;
                    column = y;

                }
            }
        }

        int [] smallestLocation = {row, column};    // Populates a 1D array with the row and column of the smallest value
        
        return smallestLocation;
    }

    public static int [] locateSmallest (int [][] arrayParam) {
        int min = arrayParam[0][0];
        int row = 0;
        int column = 0;

        for (int x = 0; x < arrayParam.length; x++){
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] < min) {
                    min = arrayParam[x][y];
                    row = x;
                    column = y;

                }
            }
        }

        int [] smallestLocation = {row, column};
        
        return smallestLocation;
    }
}
