package com.Inheritance;

public class singleInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.hashCode());

        // when we create object of parent class then child of parent is created
        // both of them sharing the same memory space so they have same hash code
        // when we add anything in parent class it will effect child class but vice versa not true

        Animal animal = new Animal();
        System.out.println(animal.hashCode());
        // Parent is separate independent entity so they can have different hash code


        d1.bark();//child method
        d1.eat();// parent method
    }
}
