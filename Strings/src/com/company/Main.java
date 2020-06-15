package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        //String

        String myString = "This is a string."; // note that String is not a primitive data type
                                                // but String has extra privilege to be used as primitive ones.
        System.out.println("My String is : " + myString);

        myString = myString + ", and this is more";
        System.out.println("New my string is : " + myString);

        String myNumberString = "500.20";
        myNumberString = myNumberString + "200";
        System.out.println("my number string is : " + myNumberString); /* Now here the result will not be an
        addition of numbers but the concatination as both are treated as string here and not numbers. */

        int myInt = 50;
        String myStr1 = "20";
        myStr1 = myStr1 + myInt;//Here we are adding string with integer value but still having any error
        //because java does auto type casting of int to string as it knows that you are adding this integer type to
        // and string value.
        System.out.println(myStr1);

        double myDouble = 500.446D;
        myStr1 = myStr1 + myDouble;// Again auto type casting of double value by java itself.
        System.out.println(myStr1);
    }
}
