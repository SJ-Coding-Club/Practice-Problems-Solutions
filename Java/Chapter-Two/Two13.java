package Chapter_Two;

/**
 * 2.13 
 * Suppose you save $100 each month into a savings account with the annual
 * interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. 
 * After the first month, the value in the account becomes: 
 * 100 * (1 + 0.00417) = 100.417 
 * After the second month, the value in the account becomes: 
 * (100 + 100.417) * (1 + 0.00417) = 201.252 
 * After the third month, the value in the account becomes: 
 * (100 + 201.252) * (1 + 0.00417) = 302.507 
 * and so on.
 * 
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month. (No loops yet)
 * 
 * @author Jack Donofrio
 * @date 1/19/20
 *
 */

import java.util.Scanner;

public class Two13
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter the monthly saving amount: ");
    double monthlySaving = s.nextDouble();
    double balance = monthlySaving;
    
    balance *= 1.00417;
    balance += monthlySaving;
    balance *= 1.00417;
    balance += monthlySaving;
    balance *= 1.00417;
    balance += monthlySaving;
    balance *= 1.00417;
    balance += monthlySaving;
    balance *= 1.00417;
    balance += monthlySaving;
    balance *= 1.00417;
    
    // This line is not mandatory. I just did this to keep 2 decimal places for cents
    balance = Math.round(balance * 100.0) / 100.0;
   
    System.out.println("After the sixth month, the account value is: $" + balance);

  }
}

// Tedious, I know. The problem said no loops so this is what it gets.