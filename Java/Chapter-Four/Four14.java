package Chapter4;

/**
 * 4.14
 * Write a program that prompts the user to enter a letter grade A, B, C,
 * D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0.
 * 
 * @author Jack Donofrio
 * @date 1/22/20
 *
 */
import java.util.Scanner;

public class Four14
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a letter grade A, B, C, D, or F: ");
    String choice = s.next();
    if (choice.equals("A"))
      System.out.print(4);
    else if (choice.equals("B"))
      System.out.print(3);
    else if (choice.equals("C"))
      System.out.print(2);
    else if (choice.equals("D"))
      System.out.print(1);
    else if (choice.equals("F"))
      System.out.print(0);
    else
      System.out.print("Error: Did not enter correct letter grade");

  }

}
