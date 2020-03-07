package Chapter_Two;

/**
 * 2.6
 * Write a program that reads an integer between 0 and 1000 and adds all the
 * digits in the integer. For example, if an integer is 932, the sum of all its
 * digits is 14.
 * 
 * Hint: Use the % operator to extract digits, and use the / operator to remove
 * the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 */
import java.util.Scanner;

public class Two_6
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 1000: ");
    int n = s.nextInt();

    // For 932, digit0 = 9, digit1 = 3, digit2 = 2
    int digit2 = n % 10;
    int digit1 = (n / 10) % 10;
    int digit0 = ((n / 10) / 10) % 10;

    System.out.println(digit0 + digit1 + digit2);
  }
}
