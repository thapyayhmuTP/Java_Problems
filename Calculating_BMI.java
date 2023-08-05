/*
The program that prompts the user to enter a weight in pounds and a height in inches, 
calculate the Body Mass Index (BMI) and displays the health interpretation of the BMI.
The BMI is calculated by dividing the weight in kilograms by the square of the height in meters. 
 */
package Java_Problems;
import java.util.*;
/**
 *
 * @author tph
 */
public class Calculating_BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter weight in pounds :");
        double weight=input.nextDouble();
        System.out.print("Enter height in meters :");
        double height=input.nextDouble();
        double weightInKg=weight*0.45359237;
        double heightInInches=height*0.0254;
        double bmi=weightInKg/(heightInInches*heightInInches);
        if(bmi<18.5)
        {
            System.out.println("Underweight!");
        }
        else if(bmi<25)
        {
            System.out.println("Normal!");
        }
        else if(bmi<30)
        {
            System.out.println("Overweight!");
        }
        else
        {
            System.out.println("Obese!");
        }
    }
    
}
