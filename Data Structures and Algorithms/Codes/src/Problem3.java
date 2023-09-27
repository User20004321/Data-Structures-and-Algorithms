
import java.util.ArrayList;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		numGen(num);
		
		

	}
		
	public static int primeChecker(int num) {
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
			return num;
		} else {
			return 0;
		}

	}
	
	public static void numGen(int num) {
		ArrayList nums = new ArrayList();
		int ceiling;
		
		for (int i = 2; i < 100; i++) {
			if( (primeChecker(i)) > 0 && nums.size() < num){
				nums.add(i);
			}
		}
		int lastIndex = nums.size() - 1;
		System.out.print(nums.get(lastIndex));
	}

}
