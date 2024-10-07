package com.NestedClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner innerObj = new Outer().new Inner();// object of non static inner class
        innerObj.display();
        Outer.StaticInner staticInner = new Outer.StaticInner(); // object of static inner class
        staticInner.display();

        outer.display();


        //Anonymous class
        Outer outer1 = new Outer()
        {
            public void display()
            {
                System.out.println(a+c+d);
            }
        };
    }
}
