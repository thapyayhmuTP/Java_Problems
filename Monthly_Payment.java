/*
The problem is to design and implement 
a program that lets the user enter the interest rate, number of years, and loan amount, 
and computes and displays monthly payment and total payment.
 */
package Java_Problems;

import java.util.Scanner;

/**
 *
 * @author tph
 */
public class Monthly_Payment {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);   
      System.out.print("Enter annual interest rate :");
      double annualRate = input.nextDouble();
      System.out.print("Enter number of years :");
      int years = input.nextInt();
      System.out.print("Enter loan amount :");
      double loanAmount = input.nextDouble();
      double monthlyRate = annualRate /1200;
      double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
      double totalPayment = monthlyPayment * years * 12;
      System.out.println("The monthly payment is £" +(int)(monthlyPayment * 100) / 100.0);
      System.out.println("The total payment is £" +(int)(totalPayment * 100) / 100.0);

    }
    
}
