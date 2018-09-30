package com.SnapIot.Static;

import static org.junit.Assert.assertEquals;

public class Car {
    private String name;
    private String engine;

    public  String test = "";

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }


    public static int setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
        return numberOfCars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @org.junit.Test
    public void whenNumberOfCarObjectsInitialized_thenStaticCounterIncreases() {
        new Car("Jaguar", "V8");
        new Car("Bugatti", "W16");

        assertEquals(2, Car.numberOfCars);
    }

}
 class Test{

    Car car4 = new Car("Bugatti11", "W16");
     String count =  car4.test;
     public static void main(String[] args) {

          Car car2 =new Car("Bugatti", "W16");
          int count =  car2.numberOfCars++;


           int count1 =Car.setNumberOfCars(5);
         System.out.println(count1);


     }


 }