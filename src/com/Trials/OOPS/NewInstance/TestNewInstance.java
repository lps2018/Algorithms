package com.Trials.OOPS.NewInstance;

public class TestNewInstance
{


    public static void main(String[] args) throws Exception{

      //Object object =   Class.forName(args[0]).newInstance(); // create Class class object

        Object object =   Class.forName("com.Trials.OOPS.NewInstance.A").newInstance();
        System.out.println("Object created for "+object.getClass().getName());
    }
}
class A {
  //  int a;
}
class B {
   // int b;
}