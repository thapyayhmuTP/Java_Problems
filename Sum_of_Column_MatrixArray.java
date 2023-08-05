/*
Finding the sum of elements by column from matrix array
 */
package Java_Problems;
import java.util.*;
/**
 *
 * @author tph
 */
public class Sum_of_Column_MatrixArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] sum=new double[3][4];
        for(int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[i].length;j++)
            {
                sum[i][j]=input.nextDouble();
            }
        }
        for(int j=0;j<4;j++)
        {
            System.out.println("Sum of the elements at column "+j+" is "+sumColumn(sum,j));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex)
    {
        double sum=0;
        for(int i=0;i<m.length;i++)
        {
            sum+=m[i][columnIndex];
        }
        return sum;
    }
}
