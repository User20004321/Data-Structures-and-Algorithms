
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		primeChecker(num);
		
		

	}
		
	public static void primeChecker(int num) {
		boolean notPrime = false;
	
		for (int i = 2; i < 10; i++) {
			if (num == i) {
				
			} else if (num % i == 0) {
				notPrime = true;
			}
			
		}
		if (num == 2) {
			notPrime = false;
		}
			
		if (notPrime == false) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
				
			}
	}

}
