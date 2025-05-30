// Java program to count 1s in binary positive number representation recursive way
package com.bitcounter;

// Main class
public class Main {


    // Method bitsCounter to count 1s in binary number
    public static int bitsCounter(int number) {
        // Counting matching 1 in the end of number
        int counter = 0;
        if (number == 0){
            return 0;
        } else {
            counter = number & 1;
            return counter + bitsCounter(number >> 1);
        }

    }

    // Main method to run java program
    public static void main(String[] args) {

        // Number to check
        int number = 3;

        System.out.println(Main.bitsCounter(number)); // Output: 2

        // Number to check
        int number1 = 9;

        System.out.println(Main.bitsCounter(number1)); // Output: 2

        // Number to check
        int number2 = 8;

        System.out.println(Main.bitsCounter(number2)); // Output: 1

        // Number to check
        int number3 = 19;

        System.out.println(Main.bitsCounter(number3)); // Output: 3
    }
}