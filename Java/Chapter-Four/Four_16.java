package Chapter4;

/**
 * 4.16 Write a program that displays a random uppercase letter using the
 * Math.random() method
 * 
 * @author Jack Donofrio
 * @date 2/3/20
 *
 */
public class Four_16
{
  public static void main(String[] args)
  {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int randomValue = (int) (Math.random() * 27);
   
    System.out.print(1 + randomValue + ": " + alphabet.substring(randomValue, randomValue + 1));

  }
}
