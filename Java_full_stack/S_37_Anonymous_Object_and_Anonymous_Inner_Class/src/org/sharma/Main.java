package org.sharma;

import org.sharma.car.Car;
import org.sharma.shop.Door;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        /*
        So here we are going to have a look at what is anonymous object
        Anonymous object means name less object.
        So let us first take a look at anonymous object before we continue with the anonymous class
        So lets setup the similar type of example from the last lecture of local inner class, this time for
        car class
         */
        if(new Car().isStarted("qwerty")){
            System.out.println("Car is started");
        }
        else{
            System.out.println("Car is not started");
        }

        /*
        So if you will notice that we have used the object of class Car with out creating the reference of that
        inside the if statement, so this type of object is called as anonymous object and notice this could be
        used only once in the life time.
         */

        /*
        Now lets move towards the anonymous inner class
        So for this we are going to create one more class named as Door, and we will have another class named as
        Lock beside of that and it will be abstract with one abstract method named as isUnlocked().
        This class will also present inside package org.sharma.shop
        check out the class for more details.

        Now after defining the class Lock as abstract and declaring one method named as isUnlocked() as abstract
        inside that abstract class, we will try to create an object of this abstract class inside Door class
        and try to access this method and implement the functionality of this method inside Door class.
        so lets try this.
        but as soon as we will try to create an instance of Lock class inside Door class, it will throw an error
        stating that Lock class is an abstract class and cannot be instantiated.
        so to over come this we will just do one this. we will override the method of abstract class Lock inside
        our Door class directly within the special code block where we create object of Lock class.
        and the error will be over. see Door class for better details.
        Also notice that instead of putting abstract class Lock into the same Door class file we will have to
        separate out this class as we cannot have multiple classes in same file which are public.
        hence a separate class will be created which will be abstract and have one abstract method under same
        package.

        Notice that this type of anonymous inner class functionality is possible with interfaces and abstract class
        Now lets create an object of class Door
         */
        Door door = new Door();
       if (door.getLock().isUnlocked("qwerty")){
           System.out.println("door is unlocked");
       }
       else{
           System.out.println("Door is locked");
       }
       /*
       There are few things to notice for anonymous classes
       1) A normal class can implement any number of interfaces but anonymous inner class can implement only one
            interface at a time
       2) A regular class can extend a class and implement any number of interface simultaneously. But anonymous Inner
            class can extend a class or can implement an interface but not both at a time.
       3) For regular/normal class, we can write any number of constructors but we cant write any constructor for
            anonymous Inner class because anonymous class does not have any name and while defining constructor class
            name and constructor name must be same.
        */
    }
}
