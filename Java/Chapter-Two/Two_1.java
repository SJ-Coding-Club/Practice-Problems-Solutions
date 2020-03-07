package Chapter_Two;

/**
 * 2.1 
 * Write a program that reads a celsius degree in a double value from the
 * console, then converts it to Fahrenheit and displays the result. The formula
 * for the conversion is as follows: 
 * 
 *      fahrenheit = (9 / 5) * celsius + 32
 * 
 * Hint: in Java, 9/5 is 1, but 9.0/5 is 1.8
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two_1
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    double celsius = s.nextDouble();
    double fahrenheit = (9.0 / 5) * celsius + 32;
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}
