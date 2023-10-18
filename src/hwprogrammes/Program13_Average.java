package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Program13_Average {
    public static void main (String []args){
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);

        // Prompt the User to enter three numbers
        System.out.print(" Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print(" Enter the second number: ");
        double number2 = input.nextDouble();
        System.out.print(" Enter the third number: ");
        double number3 = input.nextDouble();

        // Close the Scanner
        input.close();

        // Calculate the average of the three numbers
        double average = (number1 + number2 + number3);

        // Display the result
        System.out.println( " The average of the three numbers is : " + average);
    }
}
