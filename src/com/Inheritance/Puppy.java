package com.Inheritance;

public class Puppy extends Dog{
    public Puppy() {
        System.out.println(super.hashCode());
    }

    void play()
    {
        System.out.println("Playing...");
    }
}
