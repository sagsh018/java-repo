public class MethodOverloading {
	public static void main(String[] args) {
		/*
		 * here we are going to have a look at method overloading. which means the method name will remain same but the type of arguments
		 * and return type will be different and based on that method will provide different solutions with same name on the basis of how
		 * it is called.
		 * 
		 * So lets create a method to calculate the area of rectangle and square with same name.
		 */
		
		System.out.println("Area of rectangle is : "+area(3.4d, 5.6d));
		// So above method call will give us the area of rectangle
		
		System.out.println("Area of a square is : "+area(5.0d));
		// So we are using the same function name but based on the type and number of parameters the function is returning for square instead of 
		// rectangle. and this is called as method overloading.
	}
	
	public static double area(double l, double b) {
		return l*b;
	}
	
	// Now lets try to create another function with same name but different number of arguments to calculate the area of square.
	
	public static double area(double s) {
		return s*s;
	}
	
}
