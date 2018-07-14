package com.SnapIot.Numbers;

public class PalindromeNumber
{
   static int number ;
    static int remainder ;
    public static void main(String[] args)
    {
        number =121;
        palindrome();

    }

    public static int reverseNumber(int n)
    { int remainder = 0;

        for (int i = 0; i <= n; i++)
        {

            remainder = n % 10;
            n = n / 10;
            System.out.println(remainder);

        }
        return remainder;
    }

    public static boolean palindrome()
    {
        reverseNumber(number);

      if (number == remainder)
      {
          System.out.println(number+" is Palindrome:");
          return true;
      }
      else
          System.out.println(number+" is not Palindrome:");
          return false;
    }
}
