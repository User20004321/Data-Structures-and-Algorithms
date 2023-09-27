
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String userString = "";
		
		System.out.println("Please enter a String with no puncuation: ");
		userString = scnr.nextLine();
		System.out.print(backwardsString(userString));
		
		

	}
	
	public static String backwardsString(String userString) {
		String reversedString = "";
		
		for (int i = userString.length() - 1; i >= 0; i--) {
			reversedString = reversedString.concat(String.valueOf(userString.charAt(i)));
		}
		return reversedString;
	}

}
