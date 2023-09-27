import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class Problem7 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\davis\\Documents\\School\\Data Structures and Algorithms\\Codes");
		PrintStream stream = new PrintStream(file);
		System.setOut(stream);
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
