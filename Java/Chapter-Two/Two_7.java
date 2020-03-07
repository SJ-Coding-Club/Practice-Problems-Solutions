package Chapter_Two;

/**
 * 2.7 Write a program that prompts the user to enter the minutes (e.g., 1
 * billion), and displays the number of years and days for the minutes. For
 * simplicity, assume a year has 365 days.
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
import java.util.Scanner;

public class Two_7
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number of minutes: ");
    int minutes = s.nextInt();

    // 1440 minutes in a day
    int days = minutes / 1440;
    int years = days / 365; 
    int daysLeftOver = days % 365;

    System.out.println(minutes + " is approximately " + years + " years and "
      + daysLeftOver + " days.");

  }
}
