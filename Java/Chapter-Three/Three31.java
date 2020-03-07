package Chapter3;

/**
 * 3.31
 * Write a program that prompts the user to enter the exchange rate from
 * currency in USD to Chinese RMB. Prompt the user to enter 0 to convert from
 * USD to RMB and 1 to convert from RMB to USD. Prompt the user to enter the
 * amount in USD or RMB to convert it to RMB or USD, respectively.
 * 
 * @author Jack Donofrio
 * @date 1/22/20
 *
 */
import java.util.Scanner;

public class Three31
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the exchange rate from USD to RMB: ");
    // 6.91 as of 1/21/20
    double exchangeRate = s.nextDouble();

    System.out
      .println("Enter 0 to convert dollars to RMB and 1 for vice versa: ");
    int choice = s.nextInt();
    if (choice == 0)
    {
      System.out.println("Enter the dollar amount: ");
      double dollars = s.nextDouble();
      System.out
        .println("$" + dollars + " is " + (dollars * exchangeRate) + "yuan");
    }
    else if (choice == 1)
    {
      System.out.println("Enter RMB amount: ");
      double rmb = s.nextDouble();
      System.out.println(rmb + " yuan is $" + (rmb / exchangeRate));
    }
    else
      System.out.println("Only 0 and 1 are acceptable.");
  }
}
