package three;
/**
 * 3.19
 * Write a program that reads sides for a triangle and computes the
 * perimeter if the input is valid. Otherwise, display that the 
 * input is invalid. The input is valid if the sum of every pair of
 * two sides is greater than the remaining side.
 * 
 * @author Jack Donofrio
 * @date 1/21/20
 *
 */
import java.util.*;

public class Three_19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter sides a, b, c: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		if ((a + b < c) || (b + c < a) || (a + c < b))
			System.out.println("Triangle is invalid");
		else
			System.out.println("Perimeter is: " + (a + b + c));
		
	}
}
