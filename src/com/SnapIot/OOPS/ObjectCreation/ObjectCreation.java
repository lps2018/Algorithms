package com.SnapIot.OOPS.ObjectCreation;

import java.beans.Transient;
import java.io.*;

public class ObjectCreation implements Cloneable,Serializable {
     int i=10;
     int j=20;
     transient String string ="kv";

    public static void main(String[] args)
    {
        //method1
        Employee emp1 = new Employee();
        emp1.setName("Naresh");
       // System.out.println(emp1 );

       //method2
        Object object = null;
        try {
            object = Class.forName("com.SnapIot.OOPS.ObjectCreation.Employee").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println("Object created for "+object.getClass().getName());

      // method3
       // Employee emp4 = (Employee) emp1.clone();
      //  emp4.setName("Atul");
       // System.out.println(emp4 + ", hashcode : " + emp4.hashCode());

      //  method4

        try {

             ObjectCreation objectCreation = new ObjectCreation();
              FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
             objectOutputStream.writeObject(objectCreation);
             System.out.println("Serialization ended");
             System.out.println("DeSerialization Started");
             FileInputStream fileInputStream = new FileInputStream("abc.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             ObjectCreation objectCreation1= (ObjectCreation) objectInputStream.readObject();
             System.out.println("DeSerialization ended");
             System.out.println(objectCreation1.i +" "+objectCreation1.j+" "+objectCreation1.string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
