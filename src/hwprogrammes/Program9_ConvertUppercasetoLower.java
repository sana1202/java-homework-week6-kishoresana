package hwprogrammes;

import java.util.Scanner;

public class Program9_ConvertUppercasetoLower {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner convert = new Scanner(System.in);

        // Prompt the User to enter a string in uppercase
        System.out.print(" Enter a string in uppercase: ");
        String inputString = convert.nextLine();

        // Close the Scanner
        convert.close();
        // Convert the uppercase string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Display the lowercase string
        System.out.println(" The String in lowercase is: " + lowercaseString);

    }
}
