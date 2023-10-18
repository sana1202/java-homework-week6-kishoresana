package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19_ConvertStringToLowerCase {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner conv = new Scanner(System.in);

        // Prompt the user to enter the string
        System.out.print( "Enter a string: ");
        String inputString = conv.nextLine();

        // Close the Scanner
        conv.close();

        // Convert the string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Display the lowercase string
        System.out.println(" Lowercase string: " +lowercaseString);
    }
}
