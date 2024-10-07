package com.Interface;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.wagging(); // own method
        dog.eat(); //grandParent interface
        dog.sleep();//grandParent interface
        dog.play();// parent interface method
        dog.groom();//parent default method
        System.out.println(Pet.add(3,4)); // parent static interface method
    }
}
