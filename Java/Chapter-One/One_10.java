/**
 * 1.10 
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a
 * program that displays the average speed in miles per hour. (Note that 1 mile
 * is 1.6 kilometers)
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
public class One_10
{
  public static void main(String[] args)
  {
    double distance = 14; // kilometers
    double time = 45.5; // minutes
    // Convert kilometers to miles and minutes to hours.
    // Divide those values to get miles per hour
    double mph = (distance / 1.6) / (time / 60);
    System.out.print("14 kilometers in 45 minutes and 30 seconds is equal to "
      + mph + " miles per hour");
  }

}
