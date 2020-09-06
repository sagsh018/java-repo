package org.sharma;

import org.sharma.shop.Door;

public class Main {

    public static void main(String[] args) {
	    /*
	    So in this lecture we are going to have a look at local inner class .
	    for this we are going to have two classes
	    1) Main class
	    2) Door class : under the org.sharma.shop package and this class is going to contain the method and inside
	        that method, there will be a class which will be called as inner local class, its scope would be inside
	        the code block of that method.

	        lets go ahead  and design this.
	     */

        Door door = new Door();
        if(door.isOpened(args[0])){
            System.out.println("The door is locked");
        }
        else{
            System.out.println("Door is opened");
        }
    }
}
