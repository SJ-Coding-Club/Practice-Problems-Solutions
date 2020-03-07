package Chapter3;

/**
 * 3.12
 * Write a program that prompts the user to enter a three-digit integer and determines
 * whether it is a palindrome number. A number is palindrome if it reads the same from 
 * right to left and from left to right.
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 *
 */
import java.util.Scanner;

public class Three12
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a three-digit number: ");
    int n = s.nextInt();

    int digit3 = n % 10;
    int digit1 = n / 100;

    if (digit3 == digit1)
      System.out.println("It's a palindrome.");
    else
      System.out.println("Not a palindrome");

  }

}
