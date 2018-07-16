package com.SnapIot.Numbers;


public class PalindromeNumber
{


    static int i;
    public static void main(String[] args)
    {
        int number =121;
        boolean isPalidrome = palindrome(number);
        if (isPalidrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    public static int reverseNumber(int n)
    {

        int length = Integer.parseInt(String.valueOf(n));
        String remainder = "";
        int reversed_number =0;
       int[] array = new int[length];
        for (i = 0; i <= n+1; i++)
        {


            array[i] = n % 10;
            n = n / 10;
           //System.out.print( array[i]);
           remainder = remainder+String .valueOf(array[i]);
            //System.out.print( remainder);

        }
        return Integer.parseInt(remainder);
    }

    public static boolean palindrome(int number)
    {
        int reveresedNumber = reverseNumber(number);

      if (number == reveresedNumber)
      {

          return true;
      }
      else

          return false;
    }
}
