package Chapter4;

/**
 * 4.20
 * Write a program that prompts the user to enter a string and displays its
 * length and its first character
 * 
 * @author Jack Donofrio
 * @date 2/3/20
 *
 */
import java.util.Scanner;

public class Four_20
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String str = s.nextLine();

    System.out.println("Length: " + str.length());
    System.out.println("First character: " + str.substring(0, 1));
  }
}
