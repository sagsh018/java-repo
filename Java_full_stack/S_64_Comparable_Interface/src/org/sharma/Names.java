package org.sharma;

public class Names implements Comparable<Names> {
	private String name;
	
	public Names(String name) {
		this.name = name;
	}
	
	public int compareTo(Names obj) {
		// here we will do our comparison on basis of the length of the string.
		// Also notice, as we have two parts of compareTo() method the first part which will be already present and this case is name field of
		// class and second part would be the object that will be passed to this compareTo() method. now we are passing the object to compareTo()
		// method of type Names, because we have already specified the comparable interface type as Names.
		// So lets put in our logic which will perform comparison based on the lenght
		
		if(name.length() == obj.name.length()) {
			return 0;
		}
		else if(name.length() < obj.name.length()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	public String toString(){
		return name;
	}
}
