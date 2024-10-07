package com.NestedInterface;

public interface OuterInterface {
    public void display();

    interface InnerInterface extends OuterInterface
    {
        public void display();
    }
    class InnerClass implements InnerInterface
    {

        @Override
        public void display() {
            System.out.println("inside inner interface of OuterInterface ");
        }
    }
}

class Myclass implements OuterInterface.InnerInterface
{

    @Override
    public void display() {
        System.out.println("from outside call nested interface");
    }

    public void getA()
    {
        System.out.println(20);
    }
}
