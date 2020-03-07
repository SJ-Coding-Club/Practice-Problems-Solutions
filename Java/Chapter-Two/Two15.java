package Chapter_Two;

/**
 * 2.15 
 * Write a program that prompts the user to enter two points (x1, y1) and
 * (x2, y2) and displays their distance. The formula for computing distance is
 *      sqrt( (x2-x1)^2 + (y2-y1)^2 )
 * Note that you can use Math.pow(a, 0.5) to compute sqrt(a)
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 * 
 */
import java.util.Scanner;

public class Two15
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter x1 and y1: ");
    double x1 = s.nextDouble();
    double y1 = s.nextDouble();

    System.out.println("Enter x2 and y2: ");
    double x2 = s.nextDouble();
    double y2 = s.nextDouble();

    double distance =
      Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
    System.out.println("The distance between (" + x1 + ", " + y1 + ") and ("
      + x2 + ", " + y2 + ") is " + distance);
  }
}
