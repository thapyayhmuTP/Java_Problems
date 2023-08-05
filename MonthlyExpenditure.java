/*
Monthly usage
 */
//a Java program for calculating the Total Money we spent last month.
package Java_Problems;

import java.util.Scanner;

/**
 *
 * @author tph
 */
public class MonthlyExpenditure {
    public static void main(String[] args) {
       final double accomoExpenses=500;
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the money spent for food :");
       double foodExpenses=input.nextDouble();
       System.out.print("Enter the money spent of leisure :");
       double leisureExpenses=input.nextDouble();
       System.out.print("Enter the money spent for clothes :");
       double clothesExpenses=input.nextDouble();
       //System.out.print("Enter the money spent for accomodation :");
       //double accomoExpenses=input.nextDouble();
       System.out.print("Enter the money spent for travel :");
       double travelExpenses=input.nextDouble();
       double totalSpent=foodExpenses+leisureExpenses+clothesExpenses+accomoExpenses+travelExpenses;
       System.out.println("The total expenditure this month was £"+totalSpent);
    }
    
}
