package Chapter4;

/**
 * 4.1
 * Write a program that prompts the user to enter the length from the enter of a
 * pentagon to a vertex and computes the area of the pentagon. The formula for
 * computing the area of a pentagon is: Area = (5 * s^2) / (4 x tan(pi/5) where
 * s is the length of a side of the pentagon. The side can be computed using the
 * formula s = 2 * r * sin(pi/5), where r is the length from the center of a
 * pentagon to a vertex. Round up two digits after the decimal point.
 * 
 * @author Jack Donofrio
 * @date 2/1/20
 *
 */
import java.util.Scanner;

public class Four1
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter the length from the center to a vertex: ");
    double centerToVertex = s.nextDouble();
    double sideLength = 2 * centerToVertex * Math.sin(Math.PI/5);
    
    double area = (5 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 5));
    area = Math.floor(area * 100) / 100; // use this to cut off extraneous digits
    
    System.out.print("Area:" + area);
    
    
  }

}
