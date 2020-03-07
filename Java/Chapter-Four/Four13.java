package Chapter4;

/**
 * 4.13
 * (Vowel or consonant?) Write a program that prompts the user to enter a
 * letter and check whether the letter is a vowel or consonant.
 * 
 * @author Jack Donofrio
 * @date 1/22/20
 *
 */
import java.util.Scanner;

public class Four13
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a letter: ");
    String letter = s.next();
    if (Character.isLetter(letter.charAt(0)) && letter.length() == 1)
      if (letter.equals("a") || letter.equals("e") || letter.equals("i")
        || letter.equals("o") || letter.equals("u"))
        System.out.println(letter + " is a vowel.");
      else
        System.out.println(letter + " is a consonant");
    else
      System.out.println("Not a letter; try again.");
  }
}
