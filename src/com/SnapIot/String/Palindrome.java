package com.SnapIot.String;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Ma       layalam ";
        boolean flag = findPalindrome(string);
        if(flag )
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not Palindrome");
    }


    public static boolean findPalindrome(String string) {
        string = string.trim();
        string= string.replaceAll(" ","");
        String reverse_string = "";
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

        for (char c : chars) {
            //System.out.print(c+" ");
            reverse_string = reverse_string + String.valueOf(c);
            //System.out.print(reverse_string);
        }

        if (string.equalsIgnoreCase(reverse_string))
        {
           // System.out.println();
            return true;
        }
        return false;
    }
}