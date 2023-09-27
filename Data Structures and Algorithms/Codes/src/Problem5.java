
import java.util.Random;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a = rand.nextInt(15) + 1;
		int b = rand.nextInt(15) + 1;
		int operation = rand.nextInt(4) + 1;
		Scanner scnr = new Scanner(System.in);
		int userInput = 0;
		
		System.out.println("Operation: " + operation);
		if (operation == 1) {
			System.out.println(a + " + " + b);
			userInput = scnr.nextInt();
			if (userInput == (a + b)) {
				System.out.println("You got it right!");
			}
		}
		if (operation == 2) {
			System.out.println(a + " * " + b);
			userInput = scnr.nextInt();
			if (userInput == (a * b)) {
				System.out.println("You got it right!");
			} else {
				System.out.println("You got it wrong!");
			}
		}
		if (operation == 3) {
			System.out.println(a + " - " + b);
			userInput = scnr.nextInt();
			if (userInput == (a - b)) {
				System.out.println("You got it right!");
			} else {
				System.out.println("You got it wrong!");
			}
		}
		if (operation == 4) {
			System.out.println(a + " / " + b);
			userInput = scnr.nextInt();
			if (userInput == (a / b)) {
				System.out.println("You got it right!");
			} else {
				System.out.println("You got it wrong!");
			}
		}
		
		
		

	}

}
