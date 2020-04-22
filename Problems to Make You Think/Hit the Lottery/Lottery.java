// Implementation by Jack Donofrio
import java.util.Scanner;
 
public class Lottery{
     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int dollars = s.nextInt();
        int hundreds = dollars / 100;
        dollars = dollars - (hundreds * 100);
        int twenties = dollars / 20;
        dollars = dollars - (twenties * 20);
        int tens = dollars / 10;
        dollars = dollars - (tens * 10);
        int fives = dollars / 5;
        dollars = dollars - (fives * 5);
        int ones = dollars % 5;
        System.out.print(hundreds + twenties + tens + fives + ones);
     }
}