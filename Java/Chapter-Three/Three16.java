package three;

/**
 * 3.16 
 * Write a program that displays a random coordinate in a rectangle. The
 * rectangle is centered at (0,0) with width 100 and height 200.
 * 
 * @author Jack Donofrio
 * @date 1/21/20
 */

public class Three_16 {
	public static void main(String[] args) {

		int x1 = -50;
		int y1 = -100;

		int x2 = 50;
		int y2 = 100;

		int xRandom = (int) (Math.random() * (50 - (-50) + 1)) - 50; // -50 to 50
		int yRandom = (int) (Math.random() * (100 - (-100) + 1)) - 100; // - 100 to 100

		System.out.println("Random point: (" + xRandom + ", " + yRandom + ")");

	}
}
