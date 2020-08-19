
public class Float_Test {
	public static void main(String args[]) {
		// So here we are going to study about floating numbers and there type of variables.
		int value_integer = 9;
		System.out.println(value_integer);
		// This is going to print just 9
		float value_floting = 9;
		System.out.println(value_floting);
		// This is going to print 9.0
		// There is another variable with double precision named as "double"
		double value_double = 9;
		System.out.println(value_double);
		// This is also going to print 9.0 only.
		
		float maxfloatvalue = Float.MAX_VALUE;
		System.out.println(maxfloatvalue);
		float minfloatvalues = Float.MIN_VALUE;
		System.out.println(minfloatvalues);
		
		double mindoublevalue = Double.MIN_NORMAL;
		double maxdoublevalue = Double.MAX_VALUE;
		System.out.println(mindoublevalue);
		System.out.println(maxdoublevalue);
		// Size of float ==> 32 bit or 4 byte
		// Size of double ==> 64 bit or 8 byte ( it is floating point number only with double precision)
		
		// In java more preference is given to double type variable and it is recommended to use double.
		
		// it is preferred that one should explicitly tell java what kind of variable we are declaring 
		float newfloat = 9f;
		double newdouble = 9d;
		int newint = 9;
		
		// dividing the above variables value by some other number as below
		
		int newint1 = 9/2;
		float newfloat1 = 9f/2f;
		double newdouble1 = 9f/2f;
		System.out.println(newint1);
		System.out.println(newfloat1);
		System.out.println(newdouble1);
		
		// To understand the difference between float and double lets consider the below example.
		
		float testfloat = 10f/6f;
		double testdouble = 10d/6d;
		System.out.println(testfloat); // o/p: 1.6666666
		System.out.println(testdouble); // o/p: 1.6666666666666667
		// So double provide double precision and thats why preferred.
		
		// Example
		
		int marker = 100;
		double percentage = marker * 0.46f;
		System.out.println("percentage is : " + percentage);
	}
}
