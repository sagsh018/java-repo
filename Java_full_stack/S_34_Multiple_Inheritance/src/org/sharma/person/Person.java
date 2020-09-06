package org.sharma.person;

public abstract class Person implements IsAlive, LiveLife {
    public void speak() {
        System.out.println("something about life");
    }

    public void breath() {
        System.out.println("I am breathing");
    }

    public void message(){
        System.out.println("life is a race");
    }

    public abstract void eat();
}