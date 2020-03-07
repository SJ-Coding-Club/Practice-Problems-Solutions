package Chapter_Two;

/**
 * 2.21 
 * Write a program that reads in investment amount, annual interest rate,
 * and number of years, and displays the future investment value using the
 * following formula:
 * 
 *      futureInvestmentValue = investmentAmount x (1 + monthlyInterestRate) ^(numberOfYears x 12)
 *      
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98
 *
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 *
 */

import java.util.Scanner;

public class Two21
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter investment amount: ");
    double amount = s.nextDouble();

    System.out.println("Enter interest rate (no % sign): ");
    double monthlyInterestRate = (s.nextDouble() / 100.0) / 12.0;

    System.out.println("Enter number of years: ");
    int years = s.nextInt();

    double futureInvestmentValue =
      amount * Math.pow(1 + monthlyInterestRate, years * 12);
    System.out.println("Accumulated value is $" + futureInvestmentValue);

  }

}
