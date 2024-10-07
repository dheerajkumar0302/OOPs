package com.Interface;

public interface Pet extends Animal{   // interface inheritance

    // public abstract by default
    void play();

    // default interface method
    default void groom()
    {
        System.out.println("Pet is being groomed");
    }

    // static method
    static int add (int a , int b)
    {
        return a+b;
    }
}
