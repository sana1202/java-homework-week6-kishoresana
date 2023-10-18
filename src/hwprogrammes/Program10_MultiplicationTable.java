package hwprogrammes;

import java.util.Scanner;

public class Program10_MultiplicationTable {
    public static void main(String[]args){
        // Create a Scanner object to read input from the User
        Scanner multi = new Scanner(System.in);

        // Prompt the User to enter a number
        System.out.print(" Enter a number: ");
        int number = multi.nextInt();

        // Close the Scanner
        multi.close();

        // Print the multiplication table for the entered number
        System.out.println(" Multiplication table for " + number + " : ");
        for (int i=1; i <= 10; i++) {
            int result = number * i;
            System.out.println( number + " x " +i+ "=" + result);
        }
    }
}
