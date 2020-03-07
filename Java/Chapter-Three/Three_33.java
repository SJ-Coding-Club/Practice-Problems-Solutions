package Chapter3;

/**
 * 3.33
 * Suppose you shop for rice in two different packages. You would like to
 * write a program to compare the cost. The program prompts the user to enter
 * the weight and price of each package and displays the one with the better
 * price. 
 * 
 * @author Jack Donofrio
 * @date 1/22/20
 *
 */
import java.util.Scanner;

public class Three_33
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter weight and price of package 1: ");
    double weight1 = s.nextDouble();
    double price1 = s.nextDouble();

    System.out.println("Enter weight and price of package 2: ");
    double weight2 = s.nextDouble();
    double price2 = s.nextDouble();

    if (price1 / weight1 < price2 / weight2)
      System.out.println("Package 1 has a better price.");
    else if (price1 / weight1 > price2 / weight2)
      System.out.println("Package 2 has a better price");
    else
      System.out.println("The packages cost the same.");
    

  }

}
