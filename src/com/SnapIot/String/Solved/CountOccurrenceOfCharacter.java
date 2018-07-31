package com.SnapIot.String.Solved;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CountOccurrenceOfCharacter {
    public static void main(String[] args) {
        String string = "aabbcad";
        char[] character = string.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (char c:character) {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
                {
                    map.put(c, 1);
                }

        }
        System.out.println(map);
    }
}
