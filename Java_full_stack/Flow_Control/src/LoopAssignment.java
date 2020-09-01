public class LoopAssignment {
	public static void main(String[] args) {
		/*
		 * Program to find the sum of digits of a given number
		 * example: 1234 => 1+2+3+4=10
		 */
		int sum = 0;
		int num = 1234;
		while(true) {
			sum = sum + num%10;
			num = num/10;
			if(num == 0) {
				break;
			}
		}
		System.out.println(sum);
		
		/*
		 * Program to find whether given number is even or not
		 */
		int num1 = 23;
	
		if(num%2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is not even");
		}
		
	}
}
