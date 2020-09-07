package org.sharma;

public class B extends A {
	private int x;
	
	public B() {
		super();
		x = 10;
	}
	
	public B(int x) {
		super();
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
}
