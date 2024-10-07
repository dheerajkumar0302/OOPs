package com.NestedInterface;

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedInterface nested = new OuterClass.InnerClass();
        nested.display();

        OuterInterface.InnerInterface obj = new OuterInterface.InnerClass();
        obj.display();



        OuterInterface.InnerInterface obj1 = new Myclass();
        obj1.display();
        //obj1.getA();   // because we use referencing of InnerInterface

        Myclass myclass = new Myclass();
        myclass.display();
        myclass.getA();

    }
}
