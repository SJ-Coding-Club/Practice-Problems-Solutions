package Chapter3;

/**
 * 3.11 (Find the number of days in a month)
 * Write a program that prompts the user to enter the month and year and
 * displays the number of days in the month. For example, if the user entered
 * month 2 and year 2012, the program should display that February 2012 had 29
 * days. If the user entered month 3 and year 2015, the program should display
 * that March 2014 had 31 days.
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 *
 */
import java.util.Scanner;

public class Three11
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter month (1-12) and year: ");
    int monthInt = s.nextInt();
    int year = s.nextInt();

    boolean isLeap = false;
    if (year % 4 == 0)
      isLeap = true;

    String month = "";
    int days;
    
    if (monthInt == 1)
    {
      month = "January";
      days = 31;
    }
    else if (monthInt == 2)
    {
      month = "February";
      days = 28;
      if (isLeap)
        days = 29;
    }
    else if (monthInt == 3)
    {
      month = "March";
      days = 31;
    }
    else if (monthInt == 4)
    {
      month = "April";
      days = 30;
    }
    else if (monthInt == 5)
    {
      month = "May";
      days = 31;
    }
    else if (monthInt == 6)
    {
      month = "June";
      days = 30;
    }
    else if (monthInt == 7)
    {
      month = "July";
      days = 31;
    }
    else if (monthInt == 8)
    {
      month = "August";
      days = 31;
    }
    else if (monthInt == 9)
    {
      month = "September";
      days = 30;
    }
    else if (monthInt == 10)
    {
      month = "October";
      days = 31;
    }
    else if (monthInt == 11)
    {
      month = "November";
      days = 30;
    }
    else
    {
      month = "December";
      days = 31;
    }
    System.out.println(month + " " + year + " had " + days + " days.");
    if (isLeap)
      System.out.println(year + " is a leap year with 366 days.");
    
    
  }

}
