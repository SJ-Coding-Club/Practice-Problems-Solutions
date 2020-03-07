package Chapter4;

/**
 * 4.24
 * Write a program that prompts the user to enter three cities and displays
 * them in ascending order.
 * 
 * @author Jack Donofrio
 *
 */
import java.util.Scanner;

public class Four_24
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    String city1 = s.next();
    String city2 = s.next();
    String city3 = s.next();

    int oneTwo = city1.compareTo(city2);
    int twoThree = city2.compareTo(city3);
    int oneThree = city1.compareTo(city3);

    
    if (oneTwo < 0 && twoThree < 0)
      System.out.println(city1 + " " + city2 + " " + city3);

  }

}
