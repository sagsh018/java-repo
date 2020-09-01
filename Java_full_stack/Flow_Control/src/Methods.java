public class Methods {
	public static void main(String[] args) {
		/*
		 * So here we are going to understand how methods are useful in creating a block of code that can be reused and reduces the lot of
		 * efforts
		 * 
		 * So let first consider the simple method and then we will check out the methods with arguments as well
		 */
		loop1();
		System.out.print("********************");
		loop2();
		/*
		 * So we are using the below two loops written in separate functions
		 * we can call these function as many as we want and thus we can reuse them again and again.
		 * So this is a advantage of methods.
		 */
		System.out.print("*********************");
		loop1();
		
		System.out.println("********************");
		System.out.println("********************");
		System.out.println("********************");
		/*
		 * Now lets call in the method with the argument by passing the required arguments as a parameters
		 * and we will try to achieve the same output which we have achieved with above function calling. 
		 */
		loopMain(0,10);
		System.out.println("********************");
		loopMain(20, 40);
		System.out.println("********************");
		loopMain(0, 10);
		
	}
	
	public static void loop1() {
		// This is method one which will be running one loop and printing the output
		int i = 0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void loop2() {
		// This is method two which is going to run another loop and printing the output
		int j = 20;
		while(j<=40) {
			System.out.println(j);
			j++;
		}
	}
	
	/*
	 * Now we will also see the method with argument, and at the time of calling that method we are going to pass the parameters
	 * So this method will help us in writing the above two methods as one.
	 */
	
	public static void loopMain(int step, int limit) {
		while (step<=limit) {
			System.out.println(step);
			step++;
		}
	}
}
