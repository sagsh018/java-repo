package org.sharma.demo;

public class Outer {
	private int testvariable1 = 20;
	private static int testvariable2 = 30;
	
	private void outerMethod1() {
		System.out.println("Testing outer class non static method1");
	}
	
	private static void outerMethod2() {
		System.out.println("Testing outer class non static method2");
	}
	
	public static void outerMethod3() {
		System.out.println("Inner variable is : " + Inner.x);
		Inner.innerStaticMethod();
	}
	
	public void outerMethod4() {
		System.out.println(testvariable1);
	}
	
	
	public static class Inner{
		public static int x = 10;
		public static void innerStaticMethod() {
			System.out.println("Testing inner static method");
			
			System.out.println("The test variable from Outer class is : " + new Outer().testvariable1);
			new Outer().outerMethod1();
			System.out.println("The test variable from Outer class is : " + Outer.testvariable2);
			Outer.outerMethod2();
		}
	}
}
