/*
Write a program that prompts the user to enter a monthly saving amount and 
displays the account value after the sixth month.
 */
package Java_Problems;

import java.util.Scanner;

/**
 *
 * @author tph
 */
public class Monthly_Saving_account {
    public static void main(String[] args) {
        final double annualRate=5.0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the monthly saving amount :");
        double monthSave=input.nextDouble();
        double monthRate=0.05/12;
        double value=0;
        for(int i=0;i<6;i++)
        {
            value=(monthSave+value)*(1+monthRate);
        }
        System.out.println("After six months, the account value is $"+value);
        /*
        100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507
        */
    }
    
}
