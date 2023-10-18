package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

public class Program17_DecimalToBinary {
    public static void main(String[]args){
        // Create a Scanner object to read input from the User
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print (" Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Convert the decimal number to binary
        String binaryNumber = convertToBinary(decimalNumber);

        // Display the binary representation
        System.out.println(" Binary representation: " +binaryNumber);

    }

        // Function to convert decimal number to binary
    public static String convertToBinary(int decimalNumber){
        if (decimalNumber == 0){
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0){
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // prepend the remainder to the binary string
            decimalNumber /=2;
        }
        return binary.toString();
    }
    }