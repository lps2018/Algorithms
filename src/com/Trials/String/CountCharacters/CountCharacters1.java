package com.Trials.String.CountCharacters;

//import org.springframework.util.StringUtils;


public class CountCharacters1 {
    public static void main(String[] args) {
        String input = "Today is Monday";
        //1. Using Spring framework StringUtils class for finding occurrence of another String
        //int count = StringUtils.countOccurrencesOf(input, "a");


       // int count = org.apache.commons.lang.StringUtils.countMatches.countMatches(input, "a");

        int charCount = 0;
        for(int i =0 ; i<input.length(); i++)
        {
            if(input.charAt(i) == 'a'){
                //charCount++;
            }
        }


        for (char character:input.toCharArray()) {
            if(character=='a'){
                charCount++;
            }

        }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for loop  " + charCount);
    }
}
