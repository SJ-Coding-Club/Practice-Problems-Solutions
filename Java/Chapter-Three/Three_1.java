package Chapter3;

/**
 * 3.1
 * The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained
 * using the following formula:
 *      r1 = (-b + sqrt(b^2 - 4ac)) / 2a    and    r2 = (-b - sqrt(b^2 - 4ac)) / 2a
 * b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive,
 * the equation has two real roots. If it is zero, the equation has one root. If it is
 * negative, the equation has no real roots.
 * 
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two 
 * roots. If the discriminant is 0, display one root. Otherwise, display "The equation 
 * has no real roots".
 * 
 * Note that you can use Math.pow(x,0.5) to compute sqrt(x).
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 *
 */

import java.util.Scanner;

public class Three_1
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a, b, c, for ax^2 + bx + c = 0:");

    double a = s.nextDouble();
    double b = s.nextDouble();
    double c = s.nextDouble();

    double discriminant = Math.pow(b, 2) - (4 * a * c);
    double root1 = (-1 * b + Math.pow(discriminant, 0.5)) / (2 * a);
    double root2 = (-1 * b - Math.pow(discriminant, 0.5)) / (2 * a);

    if (discriminant > 0)
      System.out
        .println("The equation has roots x = " + root1 + " and x = " + root2);
    else if (discriminant == 0)
      System.out.println("The equation has one root x = " + root1);
    else
      System.out.println("The equation has no real roots.");

  }
}