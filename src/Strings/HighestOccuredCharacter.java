package Strings;


import java.util.*;

public class HighestOccuredCharacter {
    public static void main(String[] args) {
        String inputString = "ppppppahbbbb";
        findHighest(  inputString);


    }

    static void findHighest( String inputString)
     {
         char[] characterArray = inputString.toCharArray();
         long max = Integer.MIN_VALUE;
         Map<Character,Integer> map = new HashMap<Character,Integer>();
         char character1 = 0;
         for (char character:characterArray)
         {
             character1 = character;
            if(map.containsKey(character))
            {
               map.put(character,map.get(character)+1);
            }
            else
            {
                map.put(character,1);
            }

        System.out.println(map);

         if (map.get(character1)>max)
         {
             max = character1;


         }
     }

     int value = 0;
         List<Integer> integerList = new ArrayList<>();
     for (Character c : map.keySet()){

         int newValue = map.get(c);
         integerList.add(newValue);
         if (newValue > value){
             value = newValue;
         }
     }

      //   Collections.sort(integerList);

     
         System.out.println("Highest occured character is: "+value);

}
}