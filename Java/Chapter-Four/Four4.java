package Chapter4;

/**
 * The area of a hexagon can be computed using the following formula (s is the
 * length of a side): 
 * 
 * Area = (6 x s^2) / (4 x tan(pi/6)) 
 * 
 * Write a program that prompts the user to enter the side of a hexagon and 
 * displays its area.
 * 
 * @author Jack Donofrio
 * @date 2/1/20
 *
 */
import java.util.Scanner;

public class Four4
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the side: ");
    double side = s.nextDouble();

    double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
    area = Math.floor(area * 100) / 100;
    System.out.println("Area of hexagon: " + area);

  }

}
