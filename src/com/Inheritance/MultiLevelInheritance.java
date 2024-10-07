package com.Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        System.out.println(puppy.hashCode());
        puppy.play();//own method
        puppy.bark();// parent method
        puppy.eat();// grandParent Method
    }
}
