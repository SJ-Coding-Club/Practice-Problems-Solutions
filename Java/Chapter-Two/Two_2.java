package Chapter_Two;

/**
 * 2.2 
 * Write a program that reads in the radius and length of a cylinder and
 * computes the area and volume using the following formulas: 
 *      area = radius * radius * pi
 *      volume = area * length
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two_2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    // Declare constant pi
    final double PI = 3.14159265359;

    System.out.println("Radius: ");
    double radius = in.nextDouble();

    System.out.println("Length: ");
    double length = in.nextDouble();

    double area = Math.pow(radius, 2) * PI;
    System.out.println("Area: " + area);

    double volume = area * length;
    System.out.println("Volume: " + volume);
  }
}