package com.Inheritance;

public class HeirachialInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("dog hashcode"+dog.hashCode());
        System.out.println("cat hashCode" + cat.hashCode());
//        Distinct Memory Allocation: Each instance of Dog and Cat is a separate object with its own memory space,
//        which results in different hash codes.
//Inheritance of hashCode(): Both Dog and Cat inherit the hashCode() method from Object,
// and since they are different instances, calling hashCode() on each will yield different values.
//Super Class Hash Code: When you refer to super.hashCode(),
// you are still referring to the hash code of the specific instance (Dog or Cat),
// not a shared hash code for all instances of Animal.

        dog.eat();
        dog.bark();

        cat.eat();
        cat.mwow();
    }
}
