package org.sharma;

class MyException extends Exception{
	int detail;
	
	MyException(int detail){
		this.detail = detail;
	}
	
	public String toString() {
		return "Entered value is : " + detail;
	}
}
