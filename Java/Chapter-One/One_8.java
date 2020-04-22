/**
 * 1.8 
 * Write a program that displays the area and perimeter of a circle that has
 * a radius of 5.5 using the following formula:
 * 
 *      perimeter = 2 * radius * pi 
 *      area = radius * radius * pi
 * 
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */
public class One_8
{
  public static void main(String[] args)
  {
    double PI = 3.14159265359;
    double radius = 5.5;

    double perimeter = 2 * radius * PI;
    System.out.println("Perimeter: " + perimeter);

    double area = radius * radius * PI;
    System.out.println("Area: " + area);
  }

}
