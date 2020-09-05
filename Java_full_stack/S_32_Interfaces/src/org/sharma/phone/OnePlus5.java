package org.sharma.phone;

public class OnePlus5 implements Phone {
	/*
	 * Notice that we are commenting this code so that we can define the methods of interface we are implenting in our class
	public int processor() {
		return 835;
	}
	*/
	
	public String processor() {
		return "SD835";
	}
	
	public String OS() {
		return "Android";
	}
	
	public int spaceInGB() {
		return 32;
	}
}
