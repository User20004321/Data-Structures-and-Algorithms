import java.util.Random;
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a = rand.nextInt(15) + 1;
		int b = rand.nextInt(15) + 1;
		
		Scanner scnr = new Scanner(System.in);
		int userInput = 0;
		int wins = 0;
		for (int i = 1; i < 21; i++) {
			int operation = rand.nextInt(4) + 1;
			System.out.println("Attempt: " + i);
			System.out.println("Operation: " + operation);
				if (operation == 1) {
					System.out.println(a + " + " + b);
					userInput = scnr.nextInt();
					if (userInput == (a + b)) {
						System.out.println("You got it right!");
						wins += 1;
					}
				}
				if (operation == 2) {
					System.out.println(a + " * " + b);
					userInput = scnr.nextInt();
					if (userInput == (a * b)) {
						System.out.println("You got it right!");
						wins += 1;
					} else {
						System.out.println("You got it wrong!");
					}
				}
				if (operation == 3) {
					System.out.println(a + " - " + b);
					userInput = scnr.nextInt();
					if (userInput == (a - b)) {
						System.out.println("You got it right!");
						wins += 1;
					} else {
						System.out.println("You got it wrong!");
					}
				}
				if (operation == 4) {
					System.out.println(a + " / " + b);
					userInput = scnr.nextInt();
					if (userInput == (a / b)) {
						System.out.println("You got it right!");
						wins += 1;
					} else {
						System.out.println("You got it wrong!");
					}
				}
		}
			System.out.println("Wins: " + wins);
		
		
		

	}

}
