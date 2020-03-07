package Chapter_Two;
/**
 * 2.5
 * Write a program that reads the subtotal and the gratuity rate, then 
 * computes the gratuity and total. For example, if the user enters 10
 * for subtotal and 15% for the gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total.
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 */

import java.util.Scanner;

public class Two_5
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter subtotal and gratuity rate, without % symbol: ");
    double subtotal = s.nextDouble();
    double gratuityRate = s.nextDouble() / 100.0; // convert percent to decimal

    double gratuity = (subtotal * gratuityRate);
    double total = gratuity + subtotal;
    System.out
      .println("The gratuity is $" + gratuity + " and total is $" + total);

  }
}
