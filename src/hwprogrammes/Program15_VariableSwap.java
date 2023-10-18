package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables
 */

public class Program15_VariableSwap {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner swap = new Scanner(System.in);

        // Prompt User to enter two values
        System.out.print( "Enter the first value: ");
        int firstValue = swap.nextInt();

        System.out.print(" Enter the second value: ");
        int secondValue = swap.nextInt();

        // Close the Scanner
        swap.close();

        // Swap the values without using a temporary variable
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;

        // Display the swapped values
        System.out.println(" After Swapping: ");
        System.out.println(" First Value: " + firstValue);
        System.out.println(" Second Value: " + secondValue);

    }
}
