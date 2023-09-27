
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String userString = "";
		String userChar;
		
		System.out.println("Type something: ");
		userString = scnr.nextLine();
		System.out.println("Type a character: ");
		userChar = scnr.next();
		letterCount(userString, userChar);

	}
	
	public static void letterCount(String userString, String userChar) {
		int count = 0;
		for (int i = 0; i < userString.length(); i++) {
			if (String.valueOf(userString.charAt(i)).equals(userChar)) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
