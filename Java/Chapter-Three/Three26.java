package Chapter3;

/**
 * 3.26 
 * Write a program that prompts the user to enter an integer and determines
 * 1) whether it is divisible by 5 and 6, 2) whether it is divisible by 5 or 6,
 * and 3) whether it is divisible by 5 or 6, but not both.
 * 
 * @author Jack Donofrio
 * @date 1/22/20
 */
import java.util.Scanner;

public class Three26
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    System.out.print("Is " + n + " divisible by 5 and 6? ");
    System.out.println(n % 5 == 0 && n % 6 == 0);

    System.out.print("Is " + n + " divisible by 5 or 6? ");
    System.out.println(n % 5 == 0 || n % 6 == 0);

    System.out.print("Is " + n + " divisible by 5 or 6, but not both? ");
    System.out.println((n % 5 == 0) != (n % 6 == 0));
  }
}
