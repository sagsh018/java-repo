package org.sharma;

public class SmartPhones {
	
	private String brand = "Apple";
	// So here this attribute is assigned a static value and it is not getting its value from any constructoe as we are not going to define any.
	// but notice that java by default inject one constructor which is minimal and called when the object of this class will be created
	// this is invisible, but it would look like below
	/*
	public SmartPhones() {
		
	}
	*/
	
	/* 
	 * So this above that that default constructor which is included by java and usually not visible
	 * Notice that jave only inject this when there is not constructor created by the user, if user create any constructor then java does 
	 * inject this constructor.
	 */
	
	public String getBrand() {
		return brand;
	}
}
