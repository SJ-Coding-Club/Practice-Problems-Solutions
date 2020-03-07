package three;
/**
 * 3.24
 * Write a program that simulates picking a card from a deck of 52
 * cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6,
 * 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, 
 * Spades) of the card. 
 * 
 * @author Jack Donofrio
 * @date 1/21/20
 */
public class Three_24 {
	
	public static void main(String[] args) {
		System.out.println("Picking a card... ");
		
		int rankInt = (int)(Math.random() * 13) + 1;
		int suitInt = (int)(Math.random() * (4 - (1) + 1)) + 1;
		
		String rank = "";
		String suit = "";
		
		if (rankInt == 1)
			rank = "Ace";
		if (rankInt >= 2 && rankInt <= 10)
			rank = rankInt + "";
		if (rankInt == 11)
			rank = "Jack";
		if (rankInt == 12)
			rank = "Queen";
		if (rankInt == 13)
			rank = "King";
		
		if (suitInt == 1)
			suit = "Clubs";
		if (suitInt == 2)
			suit = "Diamonds";
		if (suitInt == 3)
			suit = "Hearts";
		if (suitInt == 4)
			suit = "Spades";
		
		System.out.println("Your card is " + rank + " of " + suit + ".");	
	}
}