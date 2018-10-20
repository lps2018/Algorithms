package com.Trials.String;

public class LongestPalindromeFinder {
    public static void main(String[] args) {
       // System.out.println(longestPalindromeString("1234"));
       // System.out.println(longestPalindromeString("12321"));
        //System.out.println(longestPalindromeString("9912321456"));
        //System.out.println(longestPalindromeString("9912333321456"));
       // System.out.println(longestPalindromeString("12145445499"));
       // System.out.println(longestPalindromeString("1223213"));
        System.out.println(longestPalindromeString("abb"));
    }



    public static String longestPalindromeString(String string) {

        int length = string.length();
        String returnedString = "";

        for(int i=0;i<length-2;i++)
        {
            for(int j=i+1;j<length-1;j++)
            {

                String string1 =string.substring(i,j);
                String string2 = reverseString(string1);

                if(string1.equals(string2) && string1.length() > returnedString.length())
                {
                    returnedString = string1;
                }
            }
        }

        return returnedString;
    }


    public static String reverseString(String string)
    {

        String reverse = "";


        for(int i = string.length() - 1; i >= 0; i--)
        {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }

}