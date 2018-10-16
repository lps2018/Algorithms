package com.SnapIot.ForLoop;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.ArrayList;


public class IkmTest {
    public static void main (String [] args) {
        int x = 0, y = 4, z = 5;
        if (x > 0)
            if (y < 3)
                System.out.println("One");
            else if (y < 4)
                System.out.println("Two");
            else if (z > 5)
                System.out.println("Three");
            else
                System.out.println("Four");
    }
}

