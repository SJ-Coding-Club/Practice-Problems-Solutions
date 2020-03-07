package three;
/**
 * 3.18
 * A shipping company uses the following function to calculate the cost
 * (in dollars) of shopping based on the weight of the package (in pounds)
 * 
 * c(w) = 3.5, if 0 < w <= 1
 * 	    = 5.5, if 1 < w <= 3
 * 	    = 8.5, if 3 < w <= 10
 * 	    = 10.5, if 10 < w <= 20
 * 
 * Write a program that prompts the user to enter the weight of the package
 * and display the shipping cost. If the weight is greater than 20, display
 * a message "the package cannot be shipped."
 * 
 * @author Jack Donofrio
 * @date 1/21/20
 */
import java.util.Scanner;

public class Three_18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double weight = s.nextDouble();
		
		if (weight > 0 && weight <= 1)
			System.out.println("$3.5");
		if (weight > 1 && weight <= 3)
			System.out.println("$5.5");
		if (weight > 3 && weight <= 10)
			System.out.println("$8.5");
		if (weight > 10 && weight <= 20)
			System.out.println("$10.5");
		else 
			System.out.println("The package cannot be shipped.");
		
	}
}
