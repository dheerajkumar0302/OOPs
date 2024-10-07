package com.Interface;

public class Dog implements Pet{
    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }

    @Override
    public void play() {
        System.out.println("Playing...");
    }

    // optional

    @Override
    public void groom() {
        Pet.super.groom();
        System.out.println("grooming...");
    }

    public void wagging()
    {
        System.out.println("Wagging tail...");
    }
}
