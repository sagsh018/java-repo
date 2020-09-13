package org.sharma;

public class Demo {

	public static void main(String[] args) {
		/*
		 * This class is included to show the simple functionality of compareTo method which we have learnt in Main class
		 */
		
		String x = "a";
		String y = "b";
		
		System.out.println(x.compareTo(y)); // print -1(or any negetive number) as x(part1) is smaller than y(part2)
		
		x = "a";
		y = "a";
		System.out.println(x.compareTo(y)); // will print 0 because part1 and part2 are same
		
		x = "c";
		y = "b";
		System.out.println(x.compareTo(y)); // will print 1(or any positive number) as part1 is greater that part2
		
		/*
		 * Notice that compareTo() mehod can be only applied to the objects and not on the primitive types. if we want to apply it on 
		 * primitive data types like int and float than again we will have to make use of wrapper classes. see the examples below
		 */
		
		System.out.println("****************************************");
		
		Integer p = 1;
		Integer q = 2;
		System.out.println(p.compareTo(q)); // print nagetive value as p < q
		
		p = 2;
		q = 1;
		System.out.println(p.compareTo(q)); // print positive value as p > q
		
		p = 1;
		q = 1;
		System.out.println(p.compareTo(q)); // print 0 as both are equal.

	}

}
