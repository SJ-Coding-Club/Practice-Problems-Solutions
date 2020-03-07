package Chapter_Two;

/**
 * 2.14 
 * Body Mass Index (BMI) is a measure of health on weight. It can be
 * calculated by taking your weight in kilograms and dividing the square of your height
 * in meters. Write a program that prompts the user to enter a weight in pounds
 * and height in inches and displays the BMI. 
 * 
 * Note that one pound is 0.4539237 kilograms and one inch is 0.0254 meters.
 * 
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two14
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter weight in pounds: ");
    double pounds = s.nextDouble();
    double kilograms = pounds * 0.4539237;
    
    System.out.println("Enter height in inches: ");
    double inches = s.nextDouble();
    double meters = inches * 0.0254;
    
    double bodyMassIndex = kilograms / Math.pow(meters, 2);
    System.out.println("BMI is " + bodyMassIndex);
    

  }

}
