package Chapter_Two;

/**
 * 2.9
 * Average acceleration is defined as the change in velocity divided 
 * by the time taken to make the change, as shown in the following 
 * formula: 
 *        a = (v1 - v0) / t
 * Write a program that prompts the user to enter the starting velocity 
 * v0 in meters/second, the ending velocity v1 in meters/second and the 
 * time span t in seconds, and displays the average acceleration.
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two_9
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out
      .println("Enter initial velocity, ending velocity, and time span: ");

    double v0 = s.nextDouble();
    double v1 = s.nextDouble();
    double t = s.nextDouble();

    double a = (v1 - v0) / t;
    System.out.println("The average acceleration is " + a + " m/s");
  }

}
