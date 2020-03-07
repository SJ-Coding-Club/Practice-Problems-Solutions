package Chapter_Two;
/**
 * 2.10
 * Write a program that calculates the energy needed to heat water from an 
 * initial temperature to a final temperature. Your program should prompt 
 * the user to enter the amount of water in grams and the initial and final
 * temperatures of the water. The formula to compute the energy is:
 * 
 *      Q = M * (finalTemperature - initalTemperature) * 4.18
 * 
 * where Q is heat in Joules, M is mass of water in grams, temperatures are
 * in degrees Celsius, and the specific heat of water is 4.18 Joules per gram 
 * degrees Celsius
 * 
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 */

import java.util.Scanner;

public class Two10
{
  public static void main(String[] args)
  {
    final double CP = 4.18;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter mass of water in grams: ");
    double mass = s.nextDouble();

    System.out.println("Enter initial temperature: ");
    double initialTemperature = s.nextDouble();

    System.out.println("Enter final temperature");
    double finalTemperature = s.nextDouble();

    double energy = mass * (finalTemperature - initialTemperature) * CP;
    System.out.println("The energy needed is " + energy + " J");
  }
}
