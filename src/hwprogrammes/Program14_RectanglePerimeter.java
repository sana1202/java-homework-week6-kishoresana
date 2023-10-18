package hwprogrammes;

import java.util.Scanner;

/**Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 Width = 5.5 Height = 8.5
 Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20
 *
 */

public class Program14_RectanglePerimeter {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner peri = new Scanner(System.in);

        // Prompt the User to enter the height and width of the rectangle
        System.out.print(" Enter the height of the rectangle: ");
        double height = peri.nextDouble();
        System.out.print(" Enter the width of the rectangle: ");
        double width = peri.nextDouble();

        // Close the Scanner
        peri.close();

        // Calculate the area of the rectangle: Area = height * width
        double area = height * width;

        // Calculate the perimeter of the rectangle: Perimeter = 2 *(height + width)
        double perimeter = 2 * (height+width);

        // Display results
        System.out.println(" Area of the rectangle: " + area);
        System.out.println(" Perimeter of the rectangle: " + perimeter);

    }
}
