package com.AbstractClass;
import java.lang.String;
public abstract class  Animal {

    // instance variable of Animal
    private String name;

    // field
    public String breed;

    // constructor for initialization
    public Animal(String name,String breed) {
        this.name = name;
        this.breed=breed;
    }

    // getter method to return name
    public String getName() {
        return name;
    }

    // abstract method (need to implement in child class)
    protected abstract void  makeSound();

    // concrete method(not need to implement in child class)
    public void eat()
    {
        System.out.println("eating");
    }
}
