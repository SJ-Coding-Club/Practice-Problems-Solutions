package Chapter3;

/**
 * 3.4 Write a program that randomly generates an integer between 1 and 12 and
 * displays the English month name January, February, ..., December for the
 * number 1, 2, ..., 12, accordingly.
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 *
 */

public class Three_4
{
  public static void main(String[] args)
  {

    int randomInt = (int) (Math.random() * 12) + 1;
    // System.out.println(randomInt);
    // uncomment to check if it's working right.

    if (randomInt == 1)
      System.out.println("January");
    else if (randomInt == 2)
      System.out.println("February");
    else if (randomInt == 3)
      System.out.println("March");
    else if (randomInt == 4)
      System.out.println("April");
    else if (randomInt == 5)
      System.out.println("May");
    else if (randomInt == 6)
      System.out.println("June");
    else if (randomInt == 7)
      System.out.println("July");
    else if (randomInt == 8)
      System.out.println("August");
    else if (randomInt == 9)
      System.out.println("September");
    else if (randomInt == 10)
      System.out.println("October");
    else if (randomInt == 11)
      System.out.println("November");
    else
      System.out.println("December");

  }

}
/*
 * 
 * How to generate a random number from x to y
 * 
 * (int)(Math.random() * (y - x + 1)) + x
 * 
 */
