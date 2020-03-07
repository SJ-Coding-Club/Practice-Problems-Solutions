// Given three integers from user input, a, b, and c, display the lowest value and display the highest value.
// hint: use Math.max()

import java.util.Scanner;

public class TwoExtra1
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    
    int min = Math.min(a, Math.min(b, c));
    int max = Math.max(a, Math.max(b, c));
    
    System.out.println("Min= " + min);
    System.out.println("Max= " + max);
  }

}
