package com.company;

public class Main {

    public static void main(String[] args) {
	    char myCharVar = 'D'; //Note that we can only store one single character in one char variable.
        //char is 16bits in size of 2 bytes, this is to store the unicode values for the characters
        char myUnicodeVar = '\u0044';
        System.out.println("the normal character value : " + myCharVar);
        System.out.println("unicode value : " + myUnicodeVar);
        char newUnicodeVar = '\u0905';
        System.out.println("New unicode value : " + newUnicodeVar);

        /***********Boolean variable*************/

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isAboveTwentyOne = true;
        if (isAboveTwentyOne)
            System.out.println("Person is above 21");
        else
            System.out.println("Person is below 21");
    }
}
