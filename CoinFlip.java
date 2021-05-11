import java.util.Random;
import java.util.*;
public class CoinFlip {
	
	
	

	
	public static void main(String[] args) {
		


		 boolean on = true;
		 
		 while (on == true) {

System.out.println("Enter 1 for heads and 2 for tails.");


Scanner scan = new Scanner(System.in);

Random rand = new Random();
int choice = scan.nextInt();
int randland = rand.nextInt(100 - 0);



if (randland <= 50)
					{
	System.out.println("Coin landed on heads.");
if (choice == 1) {System.out.println("You win!");}     
if (choice == 2) {System.out.println("You lose!");}
	}


if (randland >= 51)
					{
System.out.println("Coin landed on tails.");
if (choice == 1) {System.out.println("You lose!");}     
if (choice == 2) {System.out.println("You win!");}
	}


		 }

		 					

}
}