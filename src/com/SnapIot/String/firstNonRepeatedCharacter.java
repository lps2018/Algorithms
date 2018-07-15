package com.SnapIot.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatedCharacter {
    public static void main(String[] args)

    {
        String string = "aabbca";
        firstNonRepeatedCharacter(string);
       // System.out.println("The first non repeated character is :  " + c);
    }


    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer>  characterhashtable=
                new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                // increment count corresponding to c
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
                return c;
            }
            else
            {
                characterhashtable.put( c , 1 ) ;

            }
        }
        // Search characterhashtable in in order of string str

        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            {
                System.out.println("11111111111"+c);
                return c;
            }

        }
        return null ;
    }

}