public class MethodOverLoading1 {
	public static void main(String[] args) {
		/*
		 * So here we are going to see more examples of method overloading 
		 */
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 5.5f)); // Notice here letter f or F is important to indicate float data type, otherwise java will take it as
											// double by default and will throw error
		
		System.out.println(sum(3.4d, 5.6d));
		System.out.println(sum(10, 20, 30));
		
	}
	
	public static int sum(int num1, int num2) {
		System.out.println("Adding 2 int entities");
		return num1+num2;
	}
	
	public static float sum(int num1, float num2) {
		System.out.println("Adding one int with one float value");
		return num1+num2;
	}
	
	public static double sum(double num1, double num2) {
		System.out.println("Adding two double numbers");
		return num1+num2;
	}
	
	public static int sum(int num1, int num2, int num3) {
		System.out.println("Adding 3 int entities");
		return num1+num2+num3;
	}
	/*
	 * So here we have overloaded method "sum" with 4 different types. based on the type of data passed to the method and type of data it 
	 * returns and also on the basis of number of parameters passed to that method
	 */
}
