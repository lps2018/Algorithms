package com.SnapIot.Abstract;

abstract class Base
{
    abstract void fun1();
     void fun()
    {
        System.out.println("Base fun() called");
    }
}
class Derived extends Base
{
    @Override
    void fun1() {

    }

    void fun()
    {
        System.out.println("Derived fun() called");
    }
}
class Main {
    public static void main(String args[]) {

        // Uncommenting the following line will cause compiler error as the
        // line tries to create an instance of abstract class.
        // Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}
