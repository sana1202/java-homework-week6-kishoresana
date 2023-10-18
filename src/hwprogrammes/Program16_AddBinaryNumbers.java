package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class Program16_AddBinaryNumbers {
    public static void main(System[]args){
        // Create a Scanner object to read input from the User
        Scanner bin = new Scanner(System.in);

        // Prompt the User to enter two binary numbers
        System.out.print(" Enter the first Binary number: ");
        String binary1 = bin.next();
        System.out.print(" Enter the second Binary number: ");
        String binary2 = bin.next();

        // Close the Scanner
        bin.close();

        // Add the binary numbers
       // String sum = add(binary1+binary2);

        // Display the result
       // System.out.println(" Sum of Binary numbers: " +sum);

    }

    //private static String addBinaryNumbers(String s)
    }

    /**
        // Function to add two binary numbers
    public static String addBinaryNumbers(String binary1){
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        // Ensure the two binary strings are of equal length by padding with leading zeros
        int maxlength = Math.max(binary1.length(), binary2.length());
        binary1 = padWithZeros(binary1, maxlength);
        binary2 = padWithZeros(binary2, maxlength);
        
    }
}
*/