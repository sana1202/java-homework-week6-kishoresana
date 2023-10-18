package hwprogrammes;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.
 */

public class Program5_Calculator {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner cal = new Scanner(System.in);

        // Prompt the User to enter two numbers
        System.out.print( " Enter the first number: ");
        double num1 = cal.nextDouble();
        System.out.print( " Enter the second number: ");
        double num2 = cal.nextDouble();

        // close the Scanner
        cal.close();

        // Perform arithmetic operations and display the results
        System.out.println(" Addition: " + num1 + "+" + num2 + "=" + add(num1, num2));
        System.out.println(" Subtraction: " + num1 + "-" + num2 + "=" + subtract(num1, num2));
        System.out.println(" Multiplication: " + num1 + "*" + num2 + "=" + multipy(num1, num2));
        System.out.println(" Division: " + num1 + "/" + num2 + "=" + divide(num1, num2));
    }
    // Method to perform addition
    public static double add(double a , double b){
        return a + b;
    }

    // Method to perform subtraction
    public static double subtract(double a, double b){
        return a - b;
    }

    // Method to perform multiplication
    public static double multipy(double a , double b){
        return a * b;
    }

    // Method to perform division
    public static double divide(double a , double b){
        if (b != 0){
        return a / b;
    } else{
            return Double.NaN; // Indicate division by Zero
        }
}
}
