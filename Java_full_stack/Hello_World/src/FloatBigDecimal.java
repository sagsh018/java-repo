import java.math.*;

public class FloatBigDecimal {
	public static void main(String[] args) {
		// Suppose we have below double values
		double x = 1.45d;
		double y = 2.55d;
		System.out.println(x+y);
		// 4.0
		
		// if we further change the value of our variables to the below
		double x1 = 1;
		double y1 = 2.55d;
		System.out.println(x1+y1);
		// 3.55
		// So still we got the expected answer and java by default converted 1 to 1.0 and added it to
		// 2.55.
		
		// but sometimes java gives the unexpected output and at that time BigDecimal inbuilt class comes
		// into the picture to help get more precise and expected answer
		
		double x2 = 1.05;
		double y2 = 2.55;
		
		System.out.println(x2+y2);
		// 3.5999999999999996 (given by java)
		// 3.6 (expected)
		// So in this case we will have to make use of special class BigDecimal and with the help of object
		// of that class we will have to add these two values
		// So lets create two objects d1 and d2 of class BigDecimal. note that you will have to import 
		// BigDecimal class
		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.55);
		System.out.println(d1.add(d2));
		// 3.5999999999999998667732370449812151491641998291015625
		// So if we notice including BigDecimal has increase the problem further. so we have to do a quick fix
		// for this and that is instead of taking integer type object, we will take up string object
		
		BigDecimal d3 = new BigDecimal("1.05");
		BigDecimal d4 = new BigDecimal("2.55");
		System.out.println(d3.add(d4));
		// 3.60
		// So this method has finally resolved the problem
		// We can get more information from the below link as well about BigDecimal Class
		// https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html
	}
}
