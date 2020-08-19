
public class CharAndBoolean {
	public static void main(String args[]) {
		boolean var = true;
		System.out.println(var);
		boolean var1 = false;
		System.out.println(var1);
		// notice that boolean variable in java can only take two of the either values, true or false.
		
		// character variable
		
		char varchar = 'a';
		System.out.println(varchar);
		
		// Character variable can not only print the single character, but it can print anything that is 
		// present inside the unicode table
		// https://unicode-table.com/en/#latin-1-supplement
		
		// example 
		
		char varchar1 = '\u00A7';
		System.out.println(varchar1);
	}
}
