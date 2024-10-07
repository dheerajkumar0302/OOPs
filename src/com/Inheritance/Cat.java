package com.Inheritance;

public class Cat extends Animal{
    public Cat() {
        System.out.println("cat parent"+super.hashCode());
    }
    void mwow()
    {
        System.out.println("meowing...");
    }
}
