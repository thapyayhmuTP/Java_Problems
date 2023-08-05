/*
Ask binary string from user
Return decimal number 
 */
package Java_Problems;
import java.util.*;
/**
 *
 * @author tph
 */
public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryStr=input.nextLine();
        System.out.println("The corresponding decimal interger value: "+binaryToDec(binaryStr));
    }
    public static int binaryToDec(String binaryString)
    {
        int decimal=0;
        for(int i=0;i<binaryString.length();i++)
        {
            char binary=binaryString.charAt(i);
            decimal=(decimal*2)+(binary-'0');
        }
        return decimal;
    }
}
