package Java_Problems;

import java.util.Scanner;

/**
 *
 * @author tph
 */
public class Calculating_Zodiac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your birth year :");
        int year=input.nextInt();
        switch(year%12)
        {
            case 0:System.out.println(" Your Zodiac sign is monkey");break;
            case 1:System.out.println(" Your Zodiac sign is rooster");break;
            case 2:System.out.println(" Your Zodiac sign is dog");break;
            case 3:System.out.println(" Your Zodiac sign is pig");break;
            case 4:System.out.println(" Your Zodiac sign is rat");break;
            case 5:System.out.println(" Your Zodiac sign is ox");break;
            case 6:System.out.println(" Your Zodiac sign is tiger");break;
            case 7:System.out.println(" Your Zodiac sign is rabbit");break;
            case 8:System.out.println(" Your Zodiac sign is dragon");break;
            case 9:System.out.println(" Your Zodiac sign is snake");break;
            case 10:System.out.println(" Your Zodiac sign is horse");break;
            case 11:System.out.println(" Your Zodiac sign is sheep");break;
        }
    }
    
}
