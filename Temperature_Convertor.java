
package Java_Problems;

import java.util.Scanner;

/**
 *
 * @author tph
 */
public class Temperature_Convertor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String answerY="Y";
        String answerN="N";
        System.out.print("Would you like to covert Celsius to Fahrenheit? (Y/N) :");
        String answer=input.next();
        if(answer.equals(answerY))
        {
            System.out.print("Enter Celsius Degree :");
            double degree=input.nextDouble();
            double fahrenheit=((9.0/5.0)*degree)+32;
            System.out.println(degree+" Celsius is "+fahrenheit+" Fahrenheit");
        }
        else if(answer.equals(answerN))
        {
            System.out.print("Enter Fahrenheit Degree :");
            double degree=input.nextDouble();
            double celsius=((degree-32)*5.0)/9;
            System.out.println(degree+" Fahrenheit is "+celsius+" Celsius");
        }
        else
        {
            System.out.println("Invalid answer. Please type Y or N.");
        }
    }
}
