public class PrimeCheck {
	public boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}

		}
		return flag;
	}
	
	public boolean isPrime(double decimalnum) {
		int num = (int) decimalnum;
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}

		}
		return flag;
	}
}
