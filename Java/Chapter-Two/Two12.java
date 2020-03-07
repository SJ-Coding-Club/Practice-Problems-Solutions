package Chapter_Two;

/**
 * 2.12 
 * Given an airplane's acceleration a and take-off speed v, you can compute
 * the minimum runway length needed for an airplane to take off using the
 * following formula:
 * 
 * length = v^2 / 2a
 * 
 * Write a program that prompts the user to enter v in meters/second and the
 * acceleration a in meters/second squared, and displays the minimum runway
 * length
 * 
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two12
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter speed and acceleration: ");
    double velocity = s.nextDouble();
    double acceleration = s.nextDouble();

    double length = Math.pow(velocity, 2) / (2 * acceleration);
    System.out
      .println("The minimum runway length for this airplane is " + length);
  }
}
