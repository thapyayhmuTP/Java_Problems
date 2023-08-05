/*
 Finding the smallest number in an array
 */
package Java_Problems;
import java.util.*;
/**
 *
 * @author tph
 */
public class Smallest_in_Array {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        double[] num=new double[10];
        for(int i=0;i<num.length;i++)
        {
            num[i]=input.nextDouble();
        }
        System.out.println("The minimum number is : "+min(num));
    }
    public static double min(double[] array)
    {
        double minimum=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(minimum>array[i])
            {
                minimum=array[i];
            }
        }
        return minimum;
    }
}
