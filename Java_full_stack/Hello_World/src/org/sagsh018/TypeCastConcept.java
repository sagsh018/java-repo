package org.sagsh018;

public class TypeCastConcept {
	public static void main(String[] args) {
		// Here we are going to discuss about type casting of one data type to another data type
		// conside the example
		short x = 5;
		int y = x;
		System.out.println(y);
		// o/p: 5
		// So here short type value is assigned to integer type value and since integer is bigger in size than
		// short, hence java won't complain about this.
		// This type of type casting is called as implicit type casting.
		// This type of casting can be taken care by java automatically.
		
		// Now consider another example
		
		// int a = 10;
		// short b = a;
		
		// o/p: Type mismatch: cannot convert from int to short
		// so for this type of casting you have to explicitly tell java to do the type casting and this is 
		// called as explicit type casting.
		
		// Implicit type casting
		// byte -> short -> int -> long -> float -> double
		// 8-bit   16-bit   32-bit 64bit   32-bit   64-bit
		// This called as widening situation. whenever there is this kind of situation, it will be implicit 
		// type casting
		
		// Explicit type casting
		// Double --> float --> long --> int --> short --> byte
		// This is a case of narrowing and this comes under explicit type casting
		// in this case we will be doing the type casting as below
		
		int a = 10;
		short b = (short) a;
		System.out.println(b);
		// o/p: 10
		
		// consider another example
		 
		int value1 = 10;
		short value2 = (byte) value1;
		// Now here we are type casting the integer value to byte value, which is explicit type casting
		// and it will be assigned to short value because short is bigger than byte, hence here implicit 
		// type casting taken place automatically.
		
		// Now lets consider the type casting in case of floating point numbers
		float p = 10.0f;
		double q = p;
		System.out.println(q);
		// o/p: 10.0
		// So this is an example of implicit type casting
		// but id do the reverse, that would require explicit type casting
		
		double p1 = 10.0d;
		float q1 = (float) p1;
		System.out.println(q1);
		
		// o/p: 10.0
		
		// Another point to notice here is that in java double has more precision that float, so if we 
		// explicitly type cast any such double type value which require more precision, its precision will be 
		// lost when casted to float
		// consider the below example:
		
		double l = 20.0123456789d;
		float m = (float) l;
		System.out.println(m);
		// o/p: 20.012346
		// So we can clearly see that precision has been truncated and we lost some data.
		
		// lets consider another example which involves String
		// String str = "10";
		// int num = (int) str;
		
		// So this kind of explicit type casting is not allowed in java because both String and int are 
		// incompatible.
		
		
		// Lets try to explicitly type cast the float value to int
		
		float dec1 = 10.0f;
		int num2 = (int) dec1;
		System.out.println(num2);
		// So this works fine as both int and float are compatible and can be type casted explicitly.
		
		
		// now lets try vice verse
		// type casting from integer data type to float data type will be done implicitly
		
		int i = 10;
		float f = i;
		System.out.println(f);
		// o.p: 10.0
		
		// So this is allowed.
		// lets try out from long to float
		
		long l1 = 10l;
		float f1 = l1;
		System.out.println(f1);
		// op: 10.0
		// So this is also allowed
		
		// Now lets try to cast from float to long
		
		float f2 = 10.0f;
		long l3 = (long) f2;
		System.out.println(l3);
		// op: 10
		// So again if you will notice there is a loss of information after thr decimal
		// lets consider another example
		
		float f4 = 10.532f;
		long l5 = (long) f4;
		System.out.println(l5);
		// op: 10, so .53 is lost.
		
		
		
		
		// So point to be taken from here is that we can implicitly type cast values from integer data types 
		// floating data types, but from floating data types we can only type cast explicitly.
		
		
		
		
		
		
		
		
		
		
	}
}
