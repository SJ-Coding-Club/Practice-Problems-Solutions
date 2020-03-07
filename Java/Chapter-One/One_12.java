/**
 * 1.12 
 * Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour. (Note
 * that 1 mile is 1.6 kilometers)
 * 
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
public class One_12
{
  public static void main(String[] args)
  {
    double distance = 24 * 1.6; // mi to km
    double time = 1 + 40.0 / 60 + 35 / 3600.0; // min to hours, sec to hours
    System.out.println("Kilometers per hour: " + (distance / time));
  }
}
