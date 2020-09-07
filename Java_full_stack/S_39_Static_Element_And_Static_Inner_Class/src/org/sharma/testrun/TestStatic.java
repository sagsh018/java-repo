package org.sharma.testrun;

public class TestStatic {
	private static int testvariable=0;
	
	// Getter method
	public static int getTestVariable() {
		return testvariable;
	}
	
	// Setter method
	public  static void setTestVariable(int testvaraible) {
		TestStatic.testvariable = testvaraible;
	}
}
