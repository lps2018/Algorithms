package com.SnapIot.String.Solved;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HighestOccuredNumber {
    public static void main(String[] args) {

        String string = "aaaaaaabbr";
        char[] character = string.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (char c:character)
        {
         if(map.containsKey(c))
         {
             map.put(c, map.get(c)+1);
         }
         else
         {
             map.put(c,1); 
         }
        }

       map.forEach((k,v)->{
          // System.out.println(k+" "+v);
       });

        AtomicInteger atomicInteger = new AtomicInteger(0);
        map.forEach((k,v)->
        {
           if (v > atomicInteger.get())
           {

            atomicInteger.set(v);
           }
        });

        System.out.println(atomicInteger.get());

    }
}
