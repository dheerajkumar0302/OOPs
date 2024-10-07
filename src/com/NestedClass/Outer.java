package com.NestedClass;

public class Outer {
    public  int a = 10;
    private int b=20;

    static int c = 30;

    final int d= 40;
    // nested member inner class
    public class Inner
    {
        // can access all member of outer class
        public void display()
        {
            System.out.println(a+b+c+d);
        }
    }
    public  void display()
    {
        // local inner class
        // cannot declare with modifier

        // can not be access outside outer class
        class LocalInner
        {
            int x=5;  // Effectively final: assigned once and not changed
            void display()
            {
                System.out.println(a+b+c+d+x);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();

    }



    // static inner class
    static class StaticInner
    {
        //
         void display()
        {
          //  System.out.println(a+""+b); // cannot access as it is acceessing non static from static
            System.out.println(c);// access static memberr
        }
    }
}
