package com.Trials.Numbers;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int number =341;
      reverseNumber(number);
    }

    public static int reverseNumber(int n)
    {
        int remainder = 0;
        int length = Integer.parseInt(String.valueOf(n));
        for (int i = 0; i <= n; i++)
        {

            remainder = n % 10;
             n = n / 10;
           System.out.print(remainder);

        }
        return remainder;
    }
}
