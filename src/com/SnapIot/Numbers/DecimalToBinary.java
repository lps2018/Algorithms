package com.SnapIot.Numbers;

public class DecimalToBinary {
    public static void main(String[] args) {

     int number =8;
        convert (number) ;

    }



    public static void convert (int number)
    {
     int reminder =0;
      int binary[] = new int[25];

     int length = Integer.parseInt(String.valueOf(number));
      for( int i =0; i<number;i++)
      {
        reminder = number %2;
        number =number/10;
        binary[i] = number%2;
        System.out.print(binary[i]);
      }
        for( int i =0; i<length;i++)
        {
            ///System.out.println(reminder);
        }
    }
}
