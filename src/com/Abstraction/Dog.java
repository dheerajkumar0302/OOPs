package com.Abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() +" is making barking sound ");
    }
}
