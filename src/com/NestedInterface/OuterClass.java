package com.NestedInterface;

public class OuterClass {
     static int a = 20;

    // static nested interface
    // by default it is static
    public interface StaticNestedInterface
    {
        public void display();
    }

    static class InnerClass implements StaticNestedInterface
    {
        @Override
        public void display()
        {
            System.out.println("in nested interface");
            System.out.println(a);
        }

    }

}
