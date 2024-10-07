package com.Abstraction;

// abstract class
public abstract class Animal {
    private String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // abstract method

    public abstract void makeSound();
    //concrete method
    public void eat()
    {
        System.out.println(name +  " is eating...");
    }
}
