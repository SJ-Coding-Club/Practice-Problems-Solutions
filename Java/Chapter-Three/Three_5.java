package Chapter3;

/**
 * 3.5
 * Write a program that prompts the user to enter an integer for today's 
 * date of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future
 * day and display the future day of the week.
 * 
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 *
 */

// This will be made much easier after you learn methods

import java.util.Scanner;

public class Three_5
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter today's date: ");
    int today = s.nextInt();

    System.out.println("Enter the number of days elapsed since today: ");
    int daysElapsed = s.nextInt();

    System.out.print("Today is ");

    int day = 0;
    day = today;

    if (day % 7 == 0)
      System.out.print("Sunday");
    if (day % 7 == 1)
      System.out.print("Monday");
    if (day % 7 == 2)
      System.out.print("Tuesday");
    if (day % 7 == 3)
      System.out.print("Wednesday");
    if (day % 7 == 4)
      System.out.print("Thursday");
    if (day % 7 == 5)
      System.out.print("Friday");
    if (day % 7 == 6)
      System.out.print("Saturday");

    System.out.print(" and the future day is ");
    day += daysElapsed;

    if (day % 7 == 0)
      System.out.print("Sunday.");
    if (day % 7 == 1)
      System.out.print("Monday.");
    if (day % 7 == 2)
      System.out.print("Tuesday.");
    if (day % 7 == 3)
      System.out.print("Wednesday.");
    if (day % 7 == 4)
      System.out.print("Thursday.");
    if (day % 7 == 5)
      System.out.print("Friday.");
    if (day % 7 == 6)
      System.out.print("Saturday.");
  }
}
