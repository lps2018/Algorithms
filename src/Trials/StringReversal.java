package Trials;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class StringReversal
{
    public static void main(String[] args) {

        String string = "kvpdddddddatty";
        Character c = null;
        char[] chars = string.toCharArray();
        int length = string.length();
        int start = 0;
        int end = length - 1;
        char temp;
        for (int i = 0; i < end; i++) {

            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;

        }

       /* for (char c : chars) {
            System.out.print(c);
        }*/


        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char ch : chars)
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
               // System.out.println(map);
            }
            else
            {
                map.put(ch,1);
               // System.out.print(map);
            }
        }


      map.forEach((k, v) ->{
          if (v > 1){
              System.out.println(k);
          }
      });

      AtomicInteger atomicInteger = new AtomicInteger(0);
      map.forEach((k, v) ->{
          if (v > atomicInteger.get()) {
              atomicInteger.set(v);
          }
      });

        System.out.println(atomicInteger.get());


    }
}
