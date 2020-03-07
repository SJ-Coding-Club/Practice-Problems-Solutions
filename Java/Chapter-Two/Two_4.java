package Chapter_Two;

/**
 * 2.4 
 * Write a program that converts pounds into kilograms. The program prompts
 * the user to enter a number in pounds, converts it to kilograms, and displays
 * the results. One pound is 0.454 kilograms. 
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two_4
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Pounds: ");
    double pounds = s.nextDouble();

    double kilograms = pounds * 0.454;
    System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
  }
}
