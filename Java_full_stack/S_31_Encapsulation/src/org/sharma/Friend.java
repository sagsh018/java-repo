package org.sharma;

public class Friend {
	private String name;
	private int age;
	
	// notice in this case we are only giving parameterized constructor, so it will bexome mendatory for user to pass in the value while creating instance of this class.
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "name : "+name+"\n"+"age : "+age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String setAge(int age) {
		if (age >= 0 && age < 100) {
			this.age = age;
			return "age set";
		}
		else {
			return "invalid age";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
