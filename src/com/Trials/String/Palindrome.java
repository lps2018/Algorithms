package com.Trials.String;

import java.util.ArrayList;

public class Palindrome
{
    public static void main(String[] args) {
        String string = "abaaba";
        String status = "";
        ArrayList arrayList = new ArrayList(10);
        String validatedMessage = isValid(string);
        if (!validatedMessage.equals("")){
            System.out.println(validatedMessage);
        }else {
            boolean isPalidrome = findPalindrome(string);
            if(isPalidrome == true){
                System.out.println("Palidrome");
            }else
                System.out.println("Not Palidrome");
        }
    }


    public static boolean findPalindrome(String string) {
        string = string.trim();
        string = string.replaceAll(" ", "");
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

        if (string.equalsIgnoreCase(reverse_string)) {
            // System.out.println();
            return true;
        }
        return false;
    }

    public static String isValid(String string)
    {
        String message = "";
        if (string.length() <= 5)
        {
            message= "Length of the string is less than 5";

        }
        if (string.length() % 2 != 0)
        {
            if (!message.equals("")){
                message= message + ", ";
            }
            message= message + "Length of string is not even";

        }
        /*else
            {
            boolean flag = findPalindrome(string);
            if (flag)
            {
                message= String.valueOf(list.set(2, "Palindrome"));
                return message;
            } else
                {
                   message= String.valueOf(list.set(3, "Not Palindrome"));
                return message;
            }

        }*/
        return message;
    }
}