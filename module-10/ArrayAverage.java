// DJ Trost | CSD320 | Assignment 10 | 16 July 2023
// Finds the average of four arrays of different data types

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        // Sets arrays
        short [] shortArray = {69, 97, 262, 969, 1550, 1632};
        int [] intArray = {1997, 1998, 2001, 2004, 2005, 2006, 2007, 2011, 2019, 2020, 2023};
        long [] longArray = {234000000000L, 200000000000L, 154000000000L, 134000000000L, 133000000000L};
        double [] doubleArray = {9.26, 10.31, 4.21, 1.23};

        // Short array information:
        System.out.printf("\nShort Array: %s\n", Arrays.toString(shortArray));
        System.out.printf("Short Array Average: %d\n", average(shortArray));
        
        // Int array information:
        System.out.printf("\nInt Array: %s\n", Arrays.toString(intArray));
        System.out.printf("Int Array Average: %d\n", average(intArray));

        // Long array information:
        System.out.printf("\nLong Array: %s\n", Arrays.toString(longArray));
        System.out.printf("Long Array Average: %,d\n", average(longArray));

        // Double array information:
        System.out.printf("\nDouble Array: %s\n", Arrays.toString(doubleArray));
        System.out.printf("Double Array Average: %f", average(doubleArray));

        System.out.println("\n");
    }

    // Methods to calculate average based on data types
    public static short average (short [] array) {
        short avg = 0;
        
        // Sums the values of the array together
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        avg = (short)(avg / array.length);

        return avg;
    }

    public static int average (int [] array) {
        int avg = 0;
        
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        avg = (int)(avg / array.length);;

        return avg;
    }

    public static long average (long [] array) {
        long avg = 0;
        
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        avg = (long)(avg / array.length);;

        return avg;
    }

    public static double average (double [] array) {
        double avg = 0;
        
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        avg = (double)(avg / array.length);;

        return avg;
    }
}