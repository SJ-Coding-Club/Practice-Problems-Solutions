package Chapter_Two;

/**
 * 2.3 
 * Write a program that reads a number in feet, converts it to meters, and
 * displays the result. One foot is 0.305 meters.
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two_3
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter feet: ");
    double feet = s.nextDouble();
    double meters = feet * 0.305;
    System.out.println(feet + " feet is " + meters + " meters.");
  }

}
