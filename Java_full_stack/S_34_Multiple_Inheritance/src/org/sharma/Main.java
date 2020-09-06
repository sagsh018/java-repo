package org.sharma;

import org.sharma.person.NonVegan;
import org.sharma.person.Person;
import org.sharma.person.Vegan;

public class Main {
    public static void main(String[] args){
        /*
        So in this lecture we are going to study about the multiple inheritance which is normally not allowed
        in java, but with the help of interfaces we could apply restrictions to the classes and there methods
        and then we can implement multiple inheritance as well.

        consider the scenario where we have two classes with same method name and one more class extends both
        of these classes, so when we will try to call the method with same name in both parent classes with the
        help of child class object, then there will be an ambiguity and it will lead to an issue in an application.

        but when instead of extending the classes, if the child class implements the two interfaces, then since we
        are only implementing the functionality of a method inside the child class, so there is not ambiguity and
        multiple inheritance can be implemented easily

        To to do the example of this, we are taking the same setup which we did in case of abstract class.
        1) Main class :: having main method :: package - org.sharma
        2) Abstract class "Person" :: having one normal method speak() and one abstract method eat() and its going to
                    implements two interfaces and override methods interfaces :: package - org.sharma.person
        3) two normal classes Vegan and NonVegan : both of them will extends Person abstract class and override eat()
                    method according to there own need.

        So lets go ahead and setup the above.

        once we are able to the required setup lets create an object of abstract class Person and initialize it with
        object of our child classes Vegan and NonVegan
         */

        Person John = new Vegan();
        John.speak();
        John.breath();
        John.message();
        John.eat();

        System.out.println("**********************************");

        Person Aditi = new NonVegan();
        Aditi.speak();
        Aditi.breath();
        Aditi.message();
        Aditi.eat();

        /*
        So if you notice both the interfaces IsAlive and LiveLife, both of them have method declaration with the same
        name message(), but when we are extending them into our abstract class Person we are implementing it according
        to our own need so there is no ambiguity and we are successfully able to implement multiple
        inheritance.
         */
    }
}
