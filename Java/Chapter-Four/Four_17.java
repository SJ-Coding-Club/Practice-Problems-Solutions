package Chapter4;

/**
 * 4.17 Write a program that prompts the user to enter a year and the first
 * three letters of a month name (with the first letter in uppercase) and
 * displays the number of days in the month.
 * 
 * @author Jack Donofrio
 * @date 2/3/20
 *
 */
import java.util.Scanner;

public class Four_17
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter year: ");
    int year = s.nextInt();
    boolean leap = year % 4 == 0;

    System.out.println("Enter the first three letters of the month: ");
    String month = s.next();

    if (month.equals("Jan"))
      System.out.println("January " + year + " has 31 days.");
    else if (month.equals("Feb"))
    {
      System.out.print("February " + year + " has ");
      if (leap)
        System.out.println("29 days.");
      else
        System.out.println("28 days.");
    }
    else if (month.equals("Mar"))
      System.out.println("March " + year + " has 31 days.");
    else if (month.equals("Apr"))
      System.out.println("April " + year + " has 30 days.");
    else if (month.equals("May"))
      System.out.println("May " + year + " has 31 days.");
    else if (month.equals("Jun"))
      System.out.println("June " + year + " has 30 days.");
    else if (month.equals("Jul"))
      System.out.println("July " + year + " has 31 days.");
    else if (month.equals("Aug"))
      System.out.println("August " + year + " has 31 days.");
    else if (month.equals("Sep"))
      System.out.println("September " + year + " has 30 days.");
    else if (month.equals("Oct"))
      System.out.println("October " + year + " has 31 days.");
    else if (month.equals("Nov"))
      System.out.println("November " + year + " has 30 days.");
    else if (month.equals("Dec"))
      System.out.println("December " + year + " has 31 days.");
    else
      System.out.println(month + " is not a correct month name.");
  }
}
