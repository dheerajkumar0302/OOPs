package com.Inheritance;

public class Dog extends Animal{


    Dog()
    {
        System.out.println("dog parent"+super.hashCode());
    }
    void bark()
    {
        System.out.println("Barking...");
    }
}
