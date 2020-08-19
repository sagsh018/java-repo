
public class Int_Test {
	public static void main(String args[]) {
		// So here we are going to study about integer primitive data type
		// The integer variable is used to store whole number
		int value1 = Integer.MAX_VALUE; // This prints the maximum value which a integer variable can handle.
		int value2 = 2147483647;
		System.out.println(value1);
		System.out.println(value2);
		// Things to note
		// once a variable assigned a value, it cannot be reassigned with new value.
		// That means item assignment of variable is not allowed in java, its allowed for some variable in python
		// The maximum value for integer type variable can be displayed using Integer class mehtod MAX_VALUE.
		// and if we try to increase the value of maximum limit of integer variable it will throw out of range 
		// error
		// similarly we can also find out minimum value of a integer variable
		int value_min = Integer.MIN_VALUE;
		System.out.println(value_min);
		// shorter version of integer variable is "short"
		short short_value_min = Short.MIN_VALUE;
		System.out.println(short_value_min);
		short short_value_max = Short.MAX_VALUE;
		System.out.println(short_value_max);
		
		// Now there is another type of variable which is called as long variable.
		// for this the number has to followed with capital L letter in order to indicate jave that this is 
		// of type long variable otherwise jave count it as integer variable and thorws error
		
		long long_min_value = Long.MIN_VALUE;
		System.out.println(long_min_value);
		long long_max_value = Long.MAX_VALUE;
		System.out.println(long_max_value);
		
		// Notice if we try to declare any variable as long and assig it a value with following L, then it will 
		// Throw an error
		
		// long test_value = 11001010101010;
		// Now this value is in range of long but by default java takes it as integer number and throws out
		// of range error
		// So we have to declare like below
		
		long testvalue = 10100030000030303L;
		System.out.println(testvalue);
		
		// another small type of variable is byte
		
		byte byte_min_value = Byte.MIN_VALUE;
		System.out.println(byte_min_value);
		byte byte_max_value = Byte.MAX_VALUE;
		System.out.println(byte_max_value);
	
		
	}
}
