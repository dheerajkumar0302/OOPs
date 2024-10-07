package com.AbstractClass;

public class Main {
    public static void main(String[] args) {

        //Animal animal =  new Animal() ;
        // Animal is abstract can not be instantiated
        Dog dog = new Dog("Mantush","Human");
        dog.makeSound(); // abstract method of parent
        dog.eat(); // concrete method of parent
        dog.wagging(); // own method
    }
}
