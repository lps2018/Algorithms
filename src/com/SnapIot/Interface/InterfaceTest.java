package com.SnapIot.Interface;

public class InterfaceTest implements  Animal,mammals{
    @Override
    public void eat() {
        System.out.println("grass");
    }

    @Override
    public void travel() {
        System.out.println("No");
    }

    @Override
    public void swim() {
        System.out.println("yes");
    }

    public int noOfLegs() {
        System.out.println("9");
        return 0;
    }

    public static void main(String args[]) {
       InterfaceTest interfaceTest = new InterfaceTest();
        interfaceTest.eat();
        interfaceTest.travel();
        interfaceTest.noOfLegs();
        interfaceTest.swim();
    }
}
