package com.SnapIot.Interface.NewFeatures;

public class MyClass implements Interface1,Interface2
{




    public static void main(String[] args)
    {
        String input = "kv";
        Interface1 interface1 = new MyClass();
        Interface2 interface2 = new MyClass();
        interface1.method1();
        ((MyClass) interface1).method2();
        interface2.method2();
        ((MyClass) interface2).method1();
        interface1.log(input);
        interface2.log(input);

    }

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void log(String str)
    {
        System.out.println("log from interface1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
