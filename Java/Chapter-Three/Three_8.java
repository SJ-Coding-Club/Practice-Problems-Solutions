package Chapter3;

/**
 * 3.8 
 * (Sort Three Integers) Write a program that prompts the user to enter
 * three integers and display the integers in increasing order without 
 * using Math.max().
 * 
 * @author Jack Donofrio
 * @date 1/20/20
 *
 */
import java.util.Scanner;

public class Three_8
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter three integers: ");
    
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();

    if (a < b && b < c)
      System.out.println(a + " " + b + " " + c);
    else if (a < c && c < b)
      System.out.println(a + " " + c + " " + b);
    else if (b < a && a < c)
      System.out.println(b + " " + a + " " + c);
    else if (b < c && c < a)
      System.out.println(b + " " + c + " " + a);
    else if (c < a && a < b)
      System.out.println(c + " " + a + " " + b);
    else
      System.out.println(c + " " + b + " " + a);

  }
}
