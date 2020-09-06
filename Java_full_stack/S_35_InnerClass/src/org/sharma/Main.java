package org.sharma;

import org.sharma.car.Car;
import org.sharma.shop.Door;

public class Main {

    public static void main(String[] args) {
	    /*
	    Now here we are going to study a concept of inner class. so as name suggest , we can create class inside a
	    class
	    In this lecture we are going to discuss about the special type of inner class named as non static
	    inner class

	    So concept of inner classes is used in cases such as , suppose we have a class named as Car and inside
	    Car class there is a inner class with name as Engine, because if we see Engine has its own set of
	    attributes and functionality.

	    So we will be doing an example of a Door class and it will have one more inner class for the lock on that
	    Door.
	    1) Main class with main() method under org.sharma package.
	    2) Door class with another inner class Lock and under package : org.sharma.shop

	    So lets create a scenario
	     */

        Door door = new Door();
        door.shopStatus();
        door.getDoorLock().setLock(false);
        door.shopStatus();
        System.out.println(door.getDoorLock().getLock());

        /*
        Now lets have another example of Car and Engine
         */
        System.out.println("**************************");
        Car car = new Car();
        car.carStatus();
        car.getEngine().setIgnition(true);
        car.carStatus();
    }
}
