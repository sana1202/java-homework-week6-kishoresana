package hwprogrammes;

import java.util.Scanner;

public class Program6_CircleRadius {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner circle = new Scanner(System.in);

        // Prompt the User to enter the radius of the circle
        System.out.print("Enter the radius of the Circle:");

        // Read the radius as a double value
        double radius = circle.nextDouble();

        // Close the Scanner
        circle.close();

        // Calculate the area of the circle using the formula: Area = PI*r*r
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("The area of the Circle with radius " + radius + " is: " +area);
    }
}
