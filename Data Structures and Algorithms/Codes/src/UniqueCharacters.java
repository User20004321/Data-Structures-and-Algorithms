import java.util.Arrays;
// worked on by Davis, Jeff, Jadyn, and Andrew
public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "abcdeff";
		String string1 = "abc";
		String string2 = "qac";
		
		if (uniqueString(userInput) == false) {
			System.out.println("This isn't unique.");
		} else {
			System.out.println("This is unique.");
		}
		if (permutation(string1, string2) ==  true) {
			System.out.println("This string is a permutation.");
		} else {
			System.out.println("This string is not a permutation.");
		}
	
		
		}
		

	
	public static boolean uniqueString(String userInput) {
		
		for (int i = 0; i < (userInput.length() + 1); i++) {
			for (int j = i + 1; j < userInput.length(); j++) {
				if (userInput.charAt(i) == userInput.charAt(j)) {
					return false;
				}	
			}
		}
		return true;
	}
	
	public static boolean permutation( String input1, String input2) {
		char ip1[] = input1.toCharArray();
		char ip2[] = input2.toCharArray();
		
		Arrays.sort(ip1);
		Arrays.sort(ip2);
			
		for (int i = 0; i < input1.length(); i++) {
			if (ip1[i] != ip2[i]) {
				return false;
			}
				
		}
		return true;	
			
	}

}

