package com.AbstractClass;

public class Dog extends Animal{

    public Dog(String name,String breed) {
        super(name,breed);
    }

    @Override
    protected void makeSound() {
        System.out.println(getName()+" is making barking sound"+" which is of breed "+breed);
    }

    void wagging()
    {
        System.out.println("wagging tail...");
    }


}
