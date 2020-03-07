package Chapter4;

/**
 * 4.22 
 * Write a program that prompts the user to enter two strings and reports
 * whether the second string is a substring of the first string
 * 
 * @author Jack Donofrio
 *
 */
import java.util.Scanner;

public class Four_22
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter string s1: ");
    String s1 = s.next();
    System.out.println("Enter string s2: ");
    String s2 = s.next();

    if (s1.contains(s2))
      System.out.println(s2 + " is a substring of " + s1);
    else
      System.out.println(s2 + " is not a substring of " + s1);

  }
}
