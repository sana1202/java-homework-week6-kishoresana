package hwprogrammes;

import java.util.Scanner;

public class Program7_ConvertDegree {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner degree = new Scanner(System.in);

        // Prompt the User to enter the temperature in Fahrenheit
        System.out.print(" Enter the temperature in Fahrenheit: ");

        // Read the temperature in Fahrenheit as double value
        double fahrenheit = degree.nextDouble();

        // Close the Scanner
       degree.close();

       // Convert Fahrenheit to Celsius using the formula : (F-32) * 5/9
       double celsius = (fahrenheit -32) * 5/9;

       // Display the result
       System.out.println(" The temperature in Celsius is : " + celsius + " degrees Celsius");

    }
}
