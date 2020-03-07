package three;

/**
 * 3.14
 * Write a program that lets the user guess whether the flip of a coin
 * results in heads or tails. The program generates an integer 0 or 1,
 * which represents heads or tails. The program prompts the user to enter
 * a guess and reports whether the guess is correct or incorrect
 * 
 * @author Jack Donofrio
 * @date 1/21/20
 */

import java.util.Scanner;
public class Three_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Heads (0) or tails (1) ?");
		int guess = s.nextInt();
		int flip = (int)(Math.random() * 2);
		if (flip == 1) 
			System.out.println("It's tails");
		else
			System.out.println("It's heads");
		if (flip == guess)
			System.out.println("You guessed right!");
		else
			System.out.println("You were wrong...");
	}
}
