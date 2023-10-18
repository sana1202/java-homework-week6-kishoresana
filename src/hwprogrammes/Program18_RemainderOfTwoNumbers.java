package hwprogrammes;

import java.util.Scanner;

/**Write a Java program to print the sum (addition), multiply, subtract, divide and
 remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5
 *
 */

public class Program18_RemainderOfTwoNumbers {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner rem = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print(" Enter the first number: ");
        double number1 = rem.nextDouble();

        System.out.print(" Enter the second number: ");
        double number2 = rem.nextDouble();

        // Close the Scanner
        rem.close();

        // Perform arithmetic operations
        double sum = number1 + number2;
        double multiply = number1 * number2;
        double substract = number1 - number2;
        double division = number1 / number2;
        double remainder = number1 % number2;

        // Display the results
        System.out.println(" Sum: " +sum);
        System.out.println(" Substraction: " +substract);
        System.out.println(" Multiply: " +multiply);
        System.out.println(" Division: " +division);
        System.out.println(" Remainder: " +remainder);

    }
}
