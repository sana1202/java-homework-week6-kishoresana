package hwprogrammes;

import java.util.Scanner;

public class Program8_TriangleArea {
    public static void main(String []args){
        // Create a Scanner object to read input from the User
        Scanner angle = new Scanner(System.in);

        //Prompt the User to enter the base and height of the triangle
        System.out.print(" Enter the base of the triangle: ");
        double base = angle.nextDouble();

        System.out.print(" Enter the height of the triangle: ");
        double height = angle.nextDouble();

        // Close the Scanner
        angle.close();

        // Calculate the area of the triangle using the formula
        double area = (base * height)/2;

        //Display the result
        System.out.println(" The area of the triangle is : " + area);
    }
}
