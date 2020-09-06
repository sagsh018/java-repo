package org.sharma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        So here we are going to have a look at how we are going to take a input from a user from console
        So here we are going to make use of special class called as scanner class
        lets see the below example to understand it
         */

        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hi " + name);
        //sc.close();
        /*
        Now here nextline() method is br default putting the cursor even if we don't enter any name and hit enter
        so to over come this thing lets use another method


         */
        System.out.println("Enter your name : ");
        Scanner sc1 = new Scanner(System.in);
        String name1 = sc1.next();
        System.out.println("Hello " + name);
        // So with this the cursor will wait until you enter the name.
        // Also once you receive the input it is always better to close the input stream
        //sc1.close();

        /*
        Now suppose if you want to take only the integer value as an input we could do that using below
         */

        System.out.println("Enter your age : ");
        Scanner sc2 = new Scanner(System.in);
        int age = sc2.nextInt();
        System.out.println("Age is : "+ age);

        // So now we are finished with all the inputs so we are going to close the input stream as well

        sc2.close();
    }
}
