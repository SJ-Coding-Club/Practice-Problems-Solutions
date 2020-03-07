import java.util.*;

/**
 * Write a program that reads student scores, gets the best score, and then
 * assigns grades. The program prompts the user to enter the total number of
 * students, then prompts the user to enter all of the scores, and concludes by
 * displaying the grades
 * 
 * Grade is A if score is >= best - 10; Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30; Grade is D if score is >= best - 40;
 * Else grade is F;
 * 
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 */

public class Seven_1
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter number of students:");
    int n = s.nextInt();

    int[] scores = new int[n];

    System.out.println("Enter 4 scores: ");
    int best = scores[0];
    for (int i = 0; i < n; i++)
    {
      scores[i] = s.nextInt();
      if (scores[i] > best)
        best = scores[i];
    }
    String[] grades = grade(scores, best);
    for (int i = 0; i < n; i++)
    {
      System.out.println("Student " + i + " score is " + scores[i]
        + " and grade is " + grades[i]);
    }
  }

  public static String[] grade(int[] n, int best)
  {
    String[] grades = new String[n.length];
    for (int i = 0; i < n.length; i++)
    {
      if (n[i] >= best - 10)
        grades[i] = "A";
      else if (n[i] >= best - 20)
        grades[i] = "B";
      else if (n[i] >= best - 30)
        grades[i] = "C";
      else if (n[i] >= best - 30)
        grades[i] = "D";
      else
        grades[i] = "F";
    }

    return grades;
  }
}
