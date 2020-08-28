
public class StringClassConcepts {
	public static void main(String[] args) {
		// Notice that till now we have just seen primitive data types.
		// Now we will take a look at another type of data type which is not primitive type, rather it is 
		// class named as String
		// To declare a string variable
		String str1 = "Hello World";
		System.out.println(str1);
		// o/p: Hello World
		// Now as we all know that string is nothing but sequence of characters and we can make use of
		// unicode in order to print those characters and make a string with the help of them
		// https://unicode-table.com/en/#latin-1-supplement
		// lets change the value of of string as below
		String str = "Hello World \u00bb";
		System.out.println(str);
		// o/p: Hello World »
		
		// Now lets do something interesting with Strings
		String var1 = "10";
		String var2 = "20";
		// So we have taken two values as integers but we have made them string by including them into the 
		// Double quotes.
		// Notice '+' in java is a overloaded operator and hence is used to add two integers as well as 
		// used to concatenate two strings as well
		System.out.println(var1+var2);
		// o/p: 1020
		
		// Now lets consider another example, where we are going to use one of the variable as integer and
		// another one as string
		int var3 = 10;
		String var4 = "20";
		System.out.println(var3+var4);
		// o/p: 1020
		// So we noticed that integer variable here which is 10 is type casted into String type and then it
		// it is concatenated with the other string value 20
		// Notice that whenever there is this type of scenario, other data type is converted to String data 
		// type by default
		
		// but suppose if do do below kind of operation
		System.out.println(var3+20);
		// Now here var3 is already integer and we are trying to add another integer to this, hence result this
		// time will be integer as well.
		
		// another example
		System.out.println(var3+20+"hi");
		// Now here first two operand will be added as a integer and then when the resulted integer is added 
		// with "hi", the output will result an String again
		// o/p: 30hi
		// Note: So whenever there are two or more variables and one of the variable is of type string, than,
		// the output of any operation will be string also.
		
		// Now notice another thing that, since String is not primitive data type, it is a class in java
		// So correct way of declaring the variable and assigning the value to it is by using the object of 
		// that class
		
		String newvar = new String("Hello world");
		System.out.println(newvar);
		// o/p: Hello world
		
		
	}
}
