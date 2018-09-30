package com.SnapIot.Common;

public class StringReverseal {
    public static void main(String[] args) {

        String inputString ="kvpatty loves mohandev";
        stringReverse(inputString);
    }



    public static String stringReverse(String inputString)
    {
      char [] characterArray = inputString.toCharArray();
      int length = inputString.length()-1;

         int start = 0 ;
         int end = length ;
         char temp;
        String reversed_string ="";
         for(int i =0; i<=end;i++){
             temp = characterArray[start];
             characterArray[start] = characterArray[end];
             characterArray[end] =temp;
             start++;
             end--;


         }
        for (char c : characterArray) {



           //System.out.print(c+" ");
             reversed_string = reversed_string +  reversed_string.valueOf(c);
        }

       /*// String reversed_string = characterArray.toString();
        System.out.println(reversed_string);
         if(reversed_string.equalsIgnoreCase(inputString))
        //if(reversed_string .(inputString))
        {
            System.out.println("Plaindrome");
        }
        else{
             System.out.println("Not Plaindrome ");
    }*/
        return null;
    }


}
