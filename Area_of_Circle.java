/*
 Calculating Area of Circle
 */
package Java_Problems;

import java.util.Scanner;

/**
 *
 * @author tph
 */
public class Area_of_Circle {
    public static void main(String[] args) {
        final double pi=3.14159;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter radius :");
        double radius=input.nextDouble();
        if(radius>=0)
        {
            double area=radius*radius*pi;
            System.out.println("Area of the circle : "+area);
        }
        else
        {
            System.out.println("The system cannnot calculate negative number");
        }
    }
    
}
