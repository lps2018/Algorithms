package DesignPatterns;

public class Test {

    public static void main(String args[])
    {

        Singleton2 obj1 = Singleton2.getSingleton();
        Singleton2 obj2 = Singleton2.getSingleton();

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1==obj2);

    }
}