package Chapter_Two;

/**
 * 2.23
 * Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip.
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 */

import java.util.Scanner;

public class Two23
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter the driving distance: ");
    double distance = s.nextDouble();
    
    System.out.println("Enter miles per gallon: ");
    double milesPerGallon = s.nextDouble();
    
    System.out.println("Enter price per gallon: ");
    double pricePerGallon = s.nextDouble();
    
    double cost = (distance / milesPerGallon) * pricePerGallon;
    cost = Math.round(cost * 100.0) / 100.0; // not required
    
    System.out.println("The cost of driving is: $" + cost);
    
  }
}
