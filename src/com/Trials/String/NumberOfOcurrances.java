package com.Trials.String;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOcurrances {
    public static void main(String[] args) {
        String string = "abbdbbdbfhebbbbxxxddddddddddddddddbdb";
        char charArray[] = string.toCharArray();
        int length = charArray.length;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character character : charArray) {
            if (map.containsKey(character))
            {
                map.put(character, map.get(character) + 1);
            }
            else
            {
                map.put(character, 1);
            }

        }
        for(Character key:map.keySet())
        {
           // System.out.println(key+": "+map.get(key));
        }

        int max = Integer.MIN_VALUE;

        Map.Entry<Character, Integer> value = null;
        for (Map.Entry<Character, Integer> entry :  map.entrySet())
        {
            if (max < entry.getValue())
            {
                max = entry.getValue();
                value = entry;
            }
        }
        System.out.println(value);
    }
}