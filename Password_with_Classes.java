/*
Checking Valid password
 */
package Java_Problems;
import java.util.*;
/**
 *
 * @author tph
 */
public class Password_with_Classes {
    public static final int PASSWORD_LENGTH = 8;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter password : ");
        String pass=input.nextLine();
        if (is_Valid_Password(pass)) {
            System.out.println("Password is valid: " + pass);
        } else {
            System.out.println("Not a valid password: " + pass);
        }
    }
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) 
        {
            return false;
        }
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) 
            {
                numCount++;
            }
            else if (is_Letter(ch)) 
            {
                charCount++;
            }
            else 
            {
                return false;
            }
        }


        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
    
}
